package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.signupService;
import com.example.demo.model.Signup;

@Controller
public class MainController {
	@Autowired
	private signupService service;
	
	 @GetMapping("register")
	    public String userRegistrationPage(Model model){
	        // Empty UserForm model object to store form data
	       Signup userForm = new Signup();
	        //((Object) model).addAttribute("userForm", userForm);
	       model.addAttribute("userForm", userForm);

//	        List<String> listProfession = Arrays.asList("yes", "No");
//	        model.addAttribute("listProfession", listProfession);
	        return "register";
	    }
	 
	 
	 @PostMapping("register/save")
	    public String submitForm(Model model,@ModelAttribute("userForm") Signup userForm){
		 service.savedData(userForm);
		 
	        model.addAttribute("userForm", userForm);
	        //return "register-sucess";
	        return "index";
	    }
	 

}
