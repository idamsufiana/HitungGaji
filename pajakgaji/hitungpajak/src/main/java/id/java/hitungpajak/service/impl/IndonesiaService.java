package id.java.hitungpajak.service.impl;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import id.java.hitungpajak.service.NegaraService;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class IndonesiaService implements NegaraService{

    @Override
    public Double rumusHitung(Integer total, Integer ptkp, List<Double> pajak, Integer asuransi, Integer layer){
    
    Integer netto = 0;
    Double totalPajak= 0.0;
    Double layer1= 0.0;
    Double layer2= 0.0;

    netto = (total*12) - ptkp;
    layer1 = layer * pajak.get(0)/100;
    layer2 = (netto-layer) *pajak.get(1)/100;
    totalPajak = (layer1 + layer2)/12;

    return totalPajak;
    }
    
}
