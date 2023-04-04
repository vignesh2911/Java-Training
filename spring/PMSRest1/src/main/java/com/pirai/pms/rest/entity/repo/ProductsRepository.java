package com.pirai.pms.rest.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pirai.pms.rest.entity.Products;
@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
