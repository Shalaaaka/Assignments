package com.example.Question8.product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepo extends MongoRepository<Product,String> 
{
	
}
