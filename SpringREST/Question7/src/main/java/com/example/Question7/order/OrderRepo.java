package com.example.Question7.order;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository <Order, String>
{	
}