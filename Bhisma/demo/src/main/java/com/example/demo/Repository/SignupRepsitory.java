package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Signup;

@Repository
public interface SignupRepsitory extends JpaRepository<Signup, Integer> {
	//@Query("SELECT u FROM User u WHERE u.email = ?1")
	//Signup findByEmail(String username);

}
