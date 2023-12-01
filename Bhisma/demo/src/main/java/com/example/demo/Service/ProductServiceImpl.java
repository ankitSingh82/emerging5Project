package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductRepo;
import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepo repo;

	@Override
	public Product saveProduct(Product p) {
		Product pd= new Product();
		pd.setProduct_Name(p.getProduct_Name());
		pd.setPrice(p.getPrice());
		pd.setDiscount(p.getDiscount());
		pd.setDescription(p.getDescription());
		pd.setCategory(p.getCategory());
	

		return repo.save(p);
	}


	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}


	@Override
	public Product updateProduct(Product p, int id) {
		// TODO Auto-generated method stub
		Product ab = repo.findById(id).get();
		ab.setProduct_Name(p.getProduct_Name());
		ab.setPrice(p.getPrice());
		ab.setDiscount(p.getDiscount());
		ab.setDescription(p.getDescription());
		return ab;
	}


}
