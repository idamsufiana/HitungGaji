package id.java.hitungpajak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import id.java.hitungpajak.model.database.TarifPajak;

public interface PajakRepository extends CrudRepository<TarifPajak, Integer>{

    @Query(value= "SELECT tarif_pajak from tarif_pajak where kebangsaan = :bangsa", nativeQuery = true)
    public List<Double> getPajakbyId(@Param("bangsa") String bangsa);
    
}
