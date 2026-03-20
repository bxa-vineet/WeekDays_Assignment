package com.example.transaction.service;

import com.example.transaction.exception.PaymentFailedException;
import com.example.transaction.model.Order;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

//    @Transactional
//    public void processOrder(Order order){
//        System.out.println("Payment Success");
//    }
//
    @Transactional
    public void processOrder(Order order) throws PaymentFailedException {
        throw new PaymentFailedException("Payment Failed");
    }


}
