package com.example.Question12.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Question12.model.Account;

public interface AccountDao extends JpaRepository<Account, Integer>
{

	Account findByName(String name);

}
