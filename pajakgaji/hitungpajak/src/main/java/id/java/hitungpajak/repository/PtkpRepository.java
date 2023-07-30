package id.java.hitungpajak.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import id.java.hitungpajak.model.database.TarifPtkp;

public interface PtkpRepository extends CrudRepository<TarifPtkp, String>{

    // get data tarif ptkp
    @Query(value= "SELECT b.tarif_ptkp from kode_ptkp as a INNER JOIN tarif_ptkp as b on "+ 
    "(a.kode_kode = b.kode) where a.kebangsaan = :bangsa and a.child = :Child and a.status = :Status", nativeQuery = true)
    public Integer getTarif_ptkp(@Param("bangsa") String bangsa,
                            @Param("Child") String Child,
                            @Param("Status") String Status);


    
}
