package com.example.MessengersProjectExample.ErrorHandling;

import com.example.MessengersProjectExample.DTO.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleIllegalArgumentException(IllegalArgumentException e) {

        CommonResponse<?> commonResponse = CommonResponse.builder()
                .statusCode(102)
                .message(e.getMessage())
                .data(null)
                .build();
        return ResponseEntity.badRequest().body(commonResponse);
    }
}
