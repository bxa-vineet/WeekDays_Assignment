package com.example.transaction.service;

import com.example.transaction.exception.PaymentFailedException;
import com.example.transaction.model.Order;
import com.example.transaction.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    private PaymentService paymentService;


//    @Transactional
//    public Order createOrder(Order order){
//       Order saveorder =  orderRepository.save(order);
//       paymentService.processOrder(saveorder);
//       return saveorder;
//    }

    // Checked Exception
//    @Transactional(rollbackOn = PaymentFailedException.class)
//    public Order createOrder(Order order) throws PaymentFailedException {
//        Order savedOrder = orderRepository.save(order);
//        paymentService.processOrder(savedOrder);
//        return savedOrder;
//    }


}
