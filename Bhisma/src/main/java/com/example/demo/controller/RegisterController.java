package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Register;
import com.example.demo.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	private RegisterService ser;
	@RequestMapping(value = "/save")
	@PostMapping
	public Register data(@RequestBody Register rs) {
		return ser.savedData(rs);
	}
	
	
	

}
