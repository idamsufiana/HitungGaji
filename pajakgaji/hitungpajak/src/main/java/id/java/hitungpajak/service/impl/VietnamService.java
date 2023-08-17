package id.java.hitungpajak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.java.hitungpajak.config.properties.AppProperties;
import id.java.hitungpajak.service.NegaraService;

@Service
public class VietnamService implements NegaraService{

    @Autowired
    AppProperties appProperties;
 
    @Override
    public Double rumusHitung(Integer total, Integer ptkp, List<Double> pajak, Integer asuransi, Integer layer){
    
    Integer netto = 0;
    Double totalPajak= 0.0;
    Double layer1= 0.0;
    Double layer2= 0.0;

    netto = (total*appProperties.getTahun()) - (asuransi*appProperties.getTahun()) - ptkp;
    layer1 = layer * pajak.get(0)/appProperties.getPercent();
    layer2 = (netto-layer) *pajak.get(1)/appProperties.getPercent();
    totalPajak = (layer1 + layer2)/appProperties.getTahun();

    return totalPajak;
    }
    
}
