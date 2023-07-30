package id.java.hitungpajak.model.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="tarif_ptkp")
public class TarifPtkp {
    
    @Id
    @Column(name ="kode", length=30)
    private String kode;

    @Column(name ="tarif_ptkp")
    private int tarif_ptkp;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getTarif_ptkp() {
        return tarif_ptkp;
    }

    public void setTarif_ptkp(int tarif_ptkp) {
        this.tarif_ptkp = tarif_ptkp;
    }

    public TarifPtkp(String kode, int tarif_ptkp) {
        this.kode = kode;
        this.tarif_ptkp = tarif_ptkp;
    }

}
