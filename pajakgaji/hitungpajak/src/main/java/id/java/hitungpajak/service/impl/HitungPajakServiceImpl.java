package id.java.hitungpajak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.java.hitungpajak.repository.PajakRepository;
import id.java.hitungpajak.repository.PtkpRepository;
import id.java.hitungpajak.service.HitungPajakService;


@Service
public class HitungPajakServiceImpl implements HitungPajakService{
    
    @Autowired
    private PajakRepository pajakRepository;

    @Autowired
    private PtkpRepository ptkpRepository;


    @Override
    public List<Double> findbyBangsa(String bangsa){
        return pajakRepository.getPajakbyId(bangsa);
    }

    @Override
    public Integer getTarif_ptkp(String bangsa, String Child, String Status){
        return ptkpRepository.getTarif_ptkp(bangsa, Child, Status);
    }
    
}
