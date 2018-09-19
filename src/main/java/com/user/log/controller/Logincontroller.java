package com.user.log.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.user.log.dao.ILoginDao;
import com.user.log.dto.UserDto;
import com.user.log.model.UserModel;
import com.user.log.service.ILoginservice;

@RestController
public class Logincontroller {
	@Autowired
	private ILoginservice iLoginservice; 
	@GetMapping("/api/login/{email}")
	public UserDto findById(@PathVariable String email) {
		Optional<UserModel> optional = this.iLoginservice.findUser(email);

		if (optional.isPresent()) {
			UserDto personDTO = new UserDto();
			personDTO.setId( optional.get().getId());
			personDTO.setFirstName( optional.get().getFirstName());
			personDTO.setLastName(optional.get().getLastName());
			personDTO.setEmail(optional.get().getEmail());
			return personDTO;
		} else {
			return null;
		}
	}

}
