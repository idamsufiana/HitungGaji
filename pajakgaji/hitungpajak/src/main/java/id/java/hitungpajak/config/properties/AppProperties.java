package id.java.hitungpajak.config.properties;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
public class AppProperties {
    
        String ID = "indonesia";
        String VI = "vietnam";
        String asuransi = "Asuransi";
        String menikah = "maried";
        Integer tahun = 12;
        Integer layer = 50;
        Integer percent = 100;
        String tk = "tk";
        String k0 = "k0";
        String k1 = "k1";
        Integer pertama = 0;
        Integer kedua = 1;
}
