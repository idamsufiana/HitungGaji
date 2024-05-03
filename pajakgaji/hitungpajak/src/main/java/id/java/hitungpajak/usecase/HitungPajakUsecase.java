package id.java.hitungpajak.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import id.java.hitungpajak.config.properties.AppProperties;
import id.java.hitungpajak.model.request.RequestData;
import id.java.hitungpajak.service.HitungPajakService;
import id.java.hitungpajak.service.NegaraService;
import id.java.hitungpajak.service.impl.IndonesiaService;
import id.java.hitungpajak.service.impl.VietnamService;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HitungPajakUsecase {

    @Autowired
    HitungPajakService hitungPajakService;

    @Autowired
    IndonesiaService indonesiaService;

    @Autowired
    VietnamService vietnamService;

    @Autowired
    RumusFactory RumusFactory;

    @Autowired
    AppProperties appProperties;

    public Double hitung(RequestData requestData){

        Integer total = 0;
        Integer asuransi = 0;
        Integer amount = 0;
        String jumlahAnak = "";

        try {

        String status = requestData.getEmployee().getStatus();
        int child = requestData.getEmployee().getChilds();
        String kebangsaan = requestData.getEmployee().getCountry();

        for(int i = 0; i<requestData.getKomponen_gaji().size(); i++){
            if(requestData.getKomponen_gaji().get(i).getName().equalsIgnoreCase(appProperties.getAsuransi()) 
            && requestData.getEmployee().getCountry().equalsIgnoreCase(appProperties.getVI())){
                asuransi = requestData.getKomponen_gaji().get(i).getAmount();
            } 
            amount = requestData.getKomponen_gaji().get(i).getAmount();
            total = total+amount;       
        }

        if(kebangsaan.equalsIgnoreCase(appProperties.getID())){
            switch(child){
            case 0:
            jumlahAnak = appProperties.getTk();
            break;
            case 1:
            jumlahAnak = appProperties.getK0();
            break;
            default:
            jumlahAnak = appProperties.getK1();
        }
        }else{
            if(status.equalsIgnoreCase(appProperties.getMenikah())){
            jumlahAnak = appProperties.getK0();
            }else{
            jumlahAnak = appProperties.getTk();
            }
        }
        
            int ptkp = hitungPajakService.getTarif_ptkp(kebangsaan, jumlahAnak, status);
            List<Double> pajak = hitungPajakService.findbyBangsa(kebangsaan);
        } catch (Exception e) {
            log.error(e.getMessage()); 
        }


        NegaraService negara = RumusFactory.getBangsa(kebangsaan);
        return negara.rumusHitung(total, ptkp, pajak, asuransi, appProperties.getLayer());

    } 

    
}
