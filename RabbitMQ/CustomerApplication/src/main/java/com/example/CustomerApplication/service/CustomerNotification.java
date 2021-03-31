package com.example.CustomerApplication.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.CustomerApplication.RabbitMQConfig;
import com.example.CustomerApplication.model.Customer;
import com.example.CustomerApplication.repo.CustomerRepository;

@Component
public class CustomerNotification 
{

    @Autowired
    CustomerRepository customerRepository;

    @RabbitListener(queues = RabbitMQConfig.queueName)
    public void consumeMess(Customer customer)
    {
    	customerRepository.save(customer);
        System.out.println("Customer added to databse");
    }
}

