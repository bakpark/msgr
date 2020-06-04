package com.bp.msgr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.user.User;
import com.bp.msgr.domain.user.UserRepository;
import com.bp.msgr.dto.UserRequestDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	
	public User get(Long userId){
		return userRepository.getOne(userId);
	}
	
	public User create(UserRequestDto dto) {
		return userRepository.save(dto.toEntity());
	}
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
}
