package com.bp.msgr.service;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.room.RoomRepository;
import com.bp.msgr.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MainService {
	private final UserRepository userRepo;
	private final RoomRepository roomRepo;
	
}
