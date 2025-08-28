package com.demo.intro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.intro.model.Userrr;
import com.demo.intro.repository.UserrrRepository;

@RestController
@RequestMapping("/api/users")
public class UserrrController {
	
	@Autowired
	private UserrrRepository userrrRepository;
	
	  @PostMapping("/register")
	    public Userrr registerUser(@RequestBody Userrr user) {
	        return userrrRepository.save(user);
	    }
	  @GetMapping("/{id}")
	    public Userrr getUserById(@PathVariable Long id) {
	        return userrrRepository.findById(id).orElseThrow();
	    }

}
