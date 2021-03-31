package com.example.CustomerApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerApplication.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> 
{

}
