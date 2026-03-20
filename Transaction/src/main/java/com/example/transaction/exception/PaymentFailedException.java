package com.example.transaction.exception;

//public class PaymentFailedException extends RuntimeException {
//    public PaymentFailedException(String message) {
//        super(message);
//    }
//}

public class PaymentFailedException extends Exception {

    public PaymentFailedException(String message) {
        super(message);
    }
}