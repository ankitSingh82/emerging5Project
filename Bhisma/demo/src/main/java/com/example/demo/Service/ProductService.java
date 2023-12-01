package com.example.demo.Service;

import com.example.demo.model.Product;

public interface ProductService {
	public Product saveProduct(Product p);
	public Product updateProduct(Product p,int id);
	public void deleteProduct(int id);

}
