package com.example.transaction.exception;
import com.example.transaction.exception.PaymentFailedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PaymentFailedException.class)
    public ResponseEntity<String> handlePaymentException(PaymentFailedException ex) {
        return ResponseEntity
                .status(400)
                .body(ex.getMessage());
    }
}