package com.example.CustomerApplication.service;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.CustomerApplication.RabbitMQConfig;
import com.example.CustomerApplication.model.Customer;
import com.example.CustomerApplication.repo.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping("/customerservice")
public class CustomerService {

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    AmqpTemplate amqpTemplate;

    
    @PostMapping("/addcustomer")
    public String addCustomer(@RequestBody Customer customer)
    {
        amqpTemplate.convertAndSend(RabbitMQConfig.topicExchange,RabbitMQConfig.routingKey,customer);
        return "Customer added";
    }

    @GetMapping("/getcustomers")
    public List<Customer> getCustomers()
    {
        return customerRepo.findAll();
    }
}

