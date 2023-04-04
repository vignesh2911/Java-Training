package com.pms.service;

import java.util.List;

import com.pms.entity.Product;
import com.pms.model.ProductDTO;

public interface IProductService {
List<ProductDTO> searchAllProducts();
ProductDTO searchProductById(Integer id);
List<ProductDTO> searchProductsByManufacturer(String manufacturer);
String addProduct(ProductDTO productDTO);
ProductDTO updateProduct(ProductDTO productDTO);
String deleteProductById(Integer id);
}
