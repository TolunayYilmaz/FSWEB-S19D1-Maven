package com.workintech.s18d2.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(PlantException.class)
    public ResponseEntity<PlantErrorResponse> handleException(PlantException plantException){
        PlantErrorResponse errorResponse = new PlantErrorResponse(plantException.getHttpStatus().value(),plantException.getMessage(),System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse,plantException.getHttpStatus());
    }
    @ExceptionHandler
    public ResponseEntity<PlantErrorResponse> handleException(Exception exception){
        PlantErrorResponse errorResponse = new PlantErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),exception.getMessage(),System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}