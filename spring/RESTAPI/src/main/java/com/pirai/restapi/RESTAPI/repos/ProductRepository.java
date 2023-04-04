package com.pirai.restapi.RESTAPI.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirai.restapi.RESTAPI.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
