package id.java.hitungpajak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.java.hitungpajak.repository.PajakRepository;
import id.java.hitungpajak.repository.PtkpRepository;


@Service
public class HitungPajakService {
    
    @Autowired
    private PajakRepository pajakRepository;

    @Autowired
    private PtkpRepository ptkpRepository;


    public List<Double> findbyBangsa(String bangsa){
        return pajakRepository.getPajakbyId(bangsa);
    }


    public Integer getTarif_ptkp(String bangsa, String Child, String Status){
        return ptkpRepository.getTarif_ptkp(bangsa, Child, Status);
    }
    
}
