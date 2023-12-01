package com.example.demo.Controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.model.Product;


@RestController

public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/home")
	public String home() {
		return "This is Product Home Page";
	}
	@PostMapping("/saveProduct")
	public Product addProduct(@RequestBody Product p) {
		return service.saveProduct(p);
	}
	@PutMapping("/update/{id}")
	public Product update(@RequestBody Product p,@PathVariable("id") int id) {
		return service.updateProduct(p, id);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deletep(@PathVariable("id") int id) {
		service.deleteProduct(id);
	}

}
