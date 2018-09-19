package com.user.log.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.log.dao.ILoginDao;
import com.user.log.model.UserModel;
@Service
public class Loginservice implements  ILoginservice {
	@Autowired
	private ILoginDao iLoginDAO; 

	@Override
	public Optional<UserModel> findUser(String email) {
		if (!(email == null || email.isEmpty())) {
			
			return this.iLoginDAO.findUserInfo(email);

	} else {
		return Optional.empty();
	}
	}

}
