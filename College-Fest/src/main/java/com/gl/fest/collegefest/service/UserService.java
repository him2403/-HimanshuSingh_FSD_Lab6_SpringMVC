package com.gl.fest.collegefest.service;

import com.gl.fest.collegefest.dto.UserRegistrationDto;
import com.gl.fest.collegefest.entity.User;

public interface UserService {
	
	public User save(UserRegistrationDto registrationDto);

}
