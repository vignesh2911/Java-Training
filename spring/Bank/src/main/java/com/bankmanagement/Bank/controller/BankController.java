package com.bankmanagement.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankmanagement.Bank.entity.BankEntity;
import com.bankmanagement.Bank.service.BankServiceImpl;

@RestController
public class BankController {
	@Autowired
	BankServiceImpl service;
	@GetMapping("/getinfo")
	public List<BankEntity> getInfo(){
		return service.getInfo();
	}
}
