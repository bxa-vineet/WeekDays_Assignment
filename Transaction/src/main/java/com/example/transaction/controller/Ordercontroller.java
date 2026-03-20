package com.example.transaction.controller;

import com.example.transaction.model.Order;
import com.example.transaction.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")
public class Ordercontroller {
    @Autowired
    OrderService service ;

    @PostMapping("/createOrder")
    public Order post(@RequestBody Order order){
        return service.createOrder(order);
    }



}
