package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Product;
import com.example.demo.Model.ProductCategory;

public interface ProductService {
public Product getProductById(Long productCode);
	
	public Product getProductByProductCategory(ProductCategory productCategory);
	
	public void updateProduct(Product product);
	
	public Product saveProduct(Product product);
	public void deleteProduct(Long productCode);
	
	
	public List<Product> getAllProducts();
	
	
}

