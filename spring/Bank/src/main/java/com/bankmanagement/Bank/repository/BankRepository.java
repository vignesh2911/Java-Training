package com.bankmanagement.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankmanagement.Bank.entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity, Long>{
	
}
