package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.RegisterRepo;
import com.example.demo.model.Register;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterRepo repo;

	@Override
	public Register savedData(Register rs) {
		// TODO Auto-generated method stub
		return repo.save(rs);
	}
	
	

}
