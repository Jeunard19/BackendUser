package com.user.log.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.user.log.model.UserModel;



public interface ILoginDao extends CrudRepository<UserModel, Long>{

	@Query("SELECT p FROM UserModel p WHERE p.email = :email")
	public Optional<UserModel> findUserInfo(@Param("email") String email);

}
