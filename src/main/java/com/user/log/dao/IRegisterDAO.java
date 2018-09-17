package com.user.log.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.user.log.model.UserModel;

public interface IRegisterDAO extends CrudRepository< UserModel,Long>{
	
}
