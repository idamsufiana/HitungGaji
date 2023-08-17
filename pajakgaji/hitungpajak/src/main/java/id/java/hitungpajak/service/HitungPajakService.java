package id.java.hitungpajak.service;

import java.util.List;

public interface HitungPajakService {
    
    List<Double> findbyBangsa(String bangsa);
    Integer getTarif_ptkp(String bangsa, String Child, String Status);
}
