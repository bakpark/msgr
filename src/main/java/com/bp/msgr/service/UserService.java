package com.bp.msgr.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.user.User;
import com.bp.msgr.domain.user.UserRepository;
import com.bp.msgr.dto.UserRequestDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	
	public Optional<User> get(Long userId){
		return userRepository.findById(userId);
	}
	
	public User create(UserRequestDto dto) {
		return userRepository.save(dto.toEntity());
	}
//	
//	public User update(UserRequestDto dto) {
//		return userRepo.save(dto.toEntity());
//	}
	
	public ArrayList<User> getAll(){
		return (ArrayList<User>) userRepository.findAll();
	}
}
