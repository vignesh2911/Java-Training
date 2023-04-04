package com.bankmanagement.Bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bankmanagement.Bank.entity.BankEntity;
import com.bankmanagement.Bank.repository.BankRepository;

public class BankServiceImpl {
	@Autowired
	BankRepository repo;
	public List<BankEntity> getInfo() {
		return repo.findAll();
	}
	
}
