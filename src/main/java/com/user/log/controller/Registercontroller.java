package com.user.log.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.log.model.UserModel;
import com.user.log.service.IRegisterService;

@RestController
public class Registercontroller {
	
	@Autowired
	IRegisterService iRegisterService;
	
	@PostMapping("/api/register")
	public UserModel register(@RequestBody UserModel model) {
		return this.iRegisterService.registerUser(model);
		
	}

}
