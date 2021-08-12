package com.shintaro.SchoolAPI.entitys.user;

import java.util.Optional;

import com.shintaro.SchoolAPI.generic.Repository;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<UserEntity> {
	
	Optional<UserEntity> findByUsername(String username);
	
}
