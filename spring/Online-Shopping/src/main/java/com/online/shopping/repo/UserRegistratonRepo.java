package com.online.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.shopping.dto.UserRegistration;

public interface UserRegistratonRepo extends JpaRepository<UserRegistration, Integer> {

}
