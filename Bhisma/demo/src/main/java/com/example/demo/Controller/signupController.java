package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.signupService;
import com.example.demo.model.Signup;

@Controller
public class signupController {
	@Autowired
	private  signupService service;
	
//	@GetMapping("/")
//	public ModelAndView home()
//	{
//	    ModelAndView modelAndView = new ModelAndView();
//	    modelAndView.setViewName("index");
//	    return modelAndView;
//	}
	
	@PostMapping("/register995")
	public Signup addData(@RequestBody Signup sig) {
		return service.savedData(sig);
	}

}
