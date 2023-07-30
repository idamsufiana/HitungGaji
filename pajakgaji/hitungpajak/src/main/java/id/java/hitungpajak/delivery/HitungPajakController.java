package id.java.hitungpajak.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.java.hitungpajak.model.request.RequestData;
import id.java.hitungpajak.model.response.ResponseData;
import id.java.hitungpajak.usecase.HitungPajakUsecase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("hitungpajak")
public class HitungPajakController {

    @Autowired
    HitungPajakUsecase hitungPajakUsecase;

    @PostMapping
    public ResponseEntity<ResponseData<Double>> hitung(@Valid @RequestBody RequestData requestData, Errors errors){   

        ResponseData<Double> responseData = new ResponseData<>();

        if(errors.hasErrors()){
            for(ObjectError error:errors.getAllErrors()){
                responseData.getMessages().add(error.getDefaultMessage());
            }

            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(hitungPajakUsecase.hitung(requestData));
        return ResponseEntity.ok(responseData);
    }
    
}
