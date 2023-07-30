package id.java.hitungpajak.model.database;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="kode_ptkp")
public class KodePtkp implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name ="kebangsaan", length=100)
    private String kebangsaan;
    @Column(name ="status", length=30)
    private String status;
    @Column(name ="child", length=30)
    private String child;
    
    @OneToOne
    private TarifPtkp kode;


    public void setId(int id) {
        this.id = id;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getStatus() {
        return status;
    }


    public int getId() {
        return id;
    }



    public KodePtkp(int id, String kebangsaan, String status, String child) {
        this.id = id;
        this.kebangsaan = kebangsaan;
        this.status = status;
        this.child = child;
    }


    public String getKebangsaan() {
        return kebangsaan;
    }


    public void setKebangsaan(String kebangsaan) {
        this.kebangsaan = kebangsaan;
    }


    public String getChild() {
        return child;
    }


    public void setChild(String child) {
        this.child = child;
    }




    
}
