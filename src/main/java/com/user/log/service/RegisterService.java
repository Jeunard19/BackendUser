package com.user.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.user.log.dao.IRegisterDAO;
import com.user.log.model.UserModel;

@Service
public class RegisterService implements IRegisterService{
	@Autowired
	private IRegisterDAO iRegisterDao;

	public UserModel registerUser(UserModel model) {
		Assert.notNull(model, "Person may not be null");

		return this.iRegisterDao.save(model);
		
	}

	
	
}
