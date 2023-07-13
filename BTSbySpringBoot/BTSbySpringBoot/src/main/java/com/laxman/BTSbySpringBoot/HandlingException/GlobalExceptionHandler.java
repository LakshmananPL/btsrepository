package com.laxman.BTSbySpringBoot.HandlingException;


import com.laxman.BTSbySpringBoot.Entity.ErrorMessage;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    /*@ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorMessage> handleConstraintViolationException(ConstraintViolationException exception,
                                                                           WebRequest webRequest){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_ACCEPTABLE,exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(message);
    }*/
}
