package id.java.hitungpajak.model.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RequestData {
    
    @JsonProperty("employee")
    private employee employee;
    @JsonProperty("komponengaji")
    private List<gaji> komponen_gaji;

    @Data
    public static class employee{

    @NotEmpty(message="Name is mandatory")
    @JsonProperty("name")
    private String name;
    @NotNull(message="Gender is mandatory")
    @JsonProperty("sex")
    private String sex;
    @NotEmpty(message="Marital Status is mandatory")
    @JsonProperty("marital status")
    private String status;
    @NotEmpty(message="Childs is mandatory")
    @JsonProperty("childs")
    private int childs;    
    @NotEmpty(message="Country is mandatory")
    @JsonProperty("country")
    private String Country;
    
    }

    @Data
    public static class gaji {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("amount")
    private int amount;
    
    }
    
}
