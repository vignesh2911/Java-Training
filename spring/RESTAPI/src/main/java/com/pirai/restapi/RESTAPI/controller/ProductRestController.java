package com.pirai.restapi.RESTAPI.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pirai.restapi.RESTAPI.entity.Product;
import com.pirai.restapi.RESTAPI.repos.ProductRepository;


@RestController
public class ProductRestController {
	@Autowired
	ProductRepository repository;
	
	@RequestMapping(value = "/product/", method = RequestMethod.GET)
	public List<Product> getAll(Long id){
		return repository.findAll();
	}
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") Long id){
		return repository.findById(id).get();
	}	
	@RequestMapping(value = "/product/", method = RequestMethod.POST)
	public Product save(@RequestBody Product product){
		return repository.save(product);
	}
	@RequestMapping(value = "/product/", method = RequestMethod.PUT)
	public Product update(@RequestBody Product product){
		return repository.save(product);
	}
	@RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id){
		repository.deleteById(id);
	}

}
