package com.gl.fest.collegefest.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.gl.fest.collegefest.config.CustomUserDetails;
import com.gl.fest.collegefest.dto.UserRegistrationDto;
import com.gl.fest.collegefest.entity.Role;
import com.gl.fest.collegefest.entity.User;
import com.gl.fest.collegefest.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService, UserDetailsService{
	@Autowired
	UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public User save(UserRegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		User user = new User(registrationDto.getF_name(), registrationDto.getL_name(), registrationDto.getEmail(),
			passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("ADMIN")));

		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByEmail(username);
		if (user == null)
			throw new UsernameNotFoundException("Invalid Username or Passowrd.");
		CustomUserDetails customUserDetails = new CustomUserDetails(user);
		return customUserDetails;
	}

}
