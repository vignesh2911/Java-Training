package com.pirai.pms.rest.service;

import java.util.List;

import com.pirai.pms.rest.model.ProductsDTO;

public interface ProductsService {
	List<ProductsDTO> searchAllProducts();
	ProductsDTO searchByProductsById();
	List<ProductsDTO> searchProductByMaufacturer();
	String addProduct(ProductsDTO productsDTO);
	ProductsDTO updateProducts();
	String deleteProductById();
}
