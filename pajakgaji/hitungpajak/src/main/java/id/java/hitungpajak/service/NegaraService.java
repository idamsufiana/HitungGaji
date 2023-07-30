package id.java.hitungpajak.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface NegaraService {

    Double rumusHitung(Integer total, Integer ptkp, List<Double> pajak, Integer asuransi, Integer layer);

}
