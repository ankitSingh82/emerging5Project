package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SignupRepsitory;
import com.example.demo.model.Signup;
@Service
public class signupServiceImpl  implements signupService{
	@Autowired
	private SignupRepsitory repo;

	@Override
	public Signup savedData(Signup s) {
		// TODO Auto-generated method stub
		
		Signup sg=new Signup();
		sg.setName(s.getName());
		sg.setEmail_id(s.getEmail_id());
		sg.setPassword(s.getPassword());
		sg.setConfirm_password(s.getConfirm_password());
		return repo.save(sg);
	}

}
