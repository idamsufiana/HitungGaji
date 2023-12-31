package id.java.hitungpajak.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import id.java.hitungpajak.config.properties.AppProperties;
import id.java.hitungpajak.service.NegaraService;
import id.java.hitungpajak.service.impl.IndonesiaService;
import id.java.hitungpajak.service.impl.VietnamService;

@Component
public class RumusFactory {

    
    @Autowired
    AppProperties appProperties;

    @Autowired
    VietnamService vietnamService;

    @Autowired
    IndonesiaService indonesiaService;

    public NegaraService getBangsa(String bangsa){

        if(bangsa.equalsIgnoreCase(appProperties.getID())){
            return indonesiaService;
        }else{
            return vietnamService;
        }

    }
}
