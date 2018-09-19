package com.user.log.service;

import java.util.Optional;

import com.user.log.model.UserModel;

public interface ILoginservice {

	Optional<UserModel> findUser(String email);

	

}
