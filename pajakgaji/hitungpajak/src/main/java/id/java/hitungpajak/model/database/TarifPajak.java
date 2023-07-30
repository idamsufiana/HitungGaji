package id.java.hitungpajak.model.database;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tarif_pajak")
public class TarifPajak  implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name ="kebangsaan", length=100)
    private String kebangsaan;

    @Column(name ="rentang_penghasilan", length=100)
    private String rentang_penghasilan;

    @Column(name ="tarif_pajak")
    private Double tarif_pajak;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKebangsaan() {
        return kebangsaan;
    }

    public TarifPajak(int id, String kebangsaan, String rentang_penghasilan, double tarif_pajak) {
        this.id = id;
        this.kebangsaan = kebangsaan;
        this.rentang_penghasilan = rentang_penghasilan;
        this.tarif_pajak = tarif_pajak;
    }

    public void setKebangsaan(String kebangsaan) {
        this.kebangsaan = kebangsaan;
    }

    public String getRentang_penghasilan() {
        return rentang_penghasilan;
    }

    public void setRentang_penghasilan(String rentang_penghasilan) {
        this.rentang_penghasilan = rentang_penghasilan;
    }

    public double getTarif_pajak() {
        return tarif_pajak;
    }

    public void setTarif_pajak(double tarif_pajak) {
        this.tarif_pajak = tarif_pajak;
    }

    

    
}
