package com.bp.msgr.service;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.user.User;
import com.bp.msgr.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InitService {

	private final UserRepository userRepo;
//	private final RoomRepository roomRepo;

	public void userInit() {
		User user1 = User.builder().name("1").email("email").build();
		User user2 = User.builder().name("2").email("email").build();
		User user3 = User.builder().name("3").email("email").build();
		
		userRepo.save(user1);
		userRepo.save(user2);
		userRepo.save(user3);
	}
	public void roomInit() {
		
	}
}
