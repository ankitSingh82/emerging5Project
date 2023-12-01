package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.ProductService;
import com.example.demo.model.Product;
import com.example.demo.model.Signup;

@Controller
public class Product_MainController {
	@Autowired
	private ProductService service;
	
	 @GetMapping("product")
	    public String userRegistrationPage(Model model){
	        // Empty UserForm model object to store form data
	       Product userForm = new Product();
	        //((Object) model).addAttribute("userForm", userForm);
	       model.addAttribute("userForm", userForm);
	       
	       List<String> listCategory = Arrays.asList("Electronics", "Clothing", "Accessories");
	        model.addAttribute("listCategory", listCategory);

	        List<String> listCategory1 = Arrays.asList("yes", "No");
	        model.addAttribute("listCategory1",listCategory1 );
	        return "product";
	    }
	 
	 
	 @PostMapping("product/save")
	    public String submitForm(Model model,@ModelAttribute("userForm") Product userForm){
		 service.saveProduct(userForm);
		 
	        model.addAttribute("userForm", userForm);
	        //return "register-sucess";
	        return "product_succcess.html";
	    }
	 


}
