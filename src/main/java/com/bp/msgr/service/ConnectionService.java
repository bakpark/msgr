package com.bp.msgr.service;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.participantInfo.ParticipantInfo;
import com.bp.msgr.domain.participantInfo.ParticipantInfoRepository;
import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.room.RoomRepository;
import com.bp.msgr.domain.user.User;
import com.bp.msgr.domain.user.UserRepository;
import com.bp.msgr.dto.ConnectRequestDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConnectionService {
	private final UserRepository userRepo;
	private final RoomRepository roomRepo;
	private final ParticipantInfoRepository infoRepo;
	
	
	public ParticipantInfo connect(ConnectRequestDto dto) {
		User user = userRepo.getOne(dto.getUserId());
		Room room = roomRepo.getOne(dto.getRoomId());
		
		ParticipantInfo info = ParticipantInfo.builder()
								.user(user)
								.room(room)
								.build();
		infoRepo.save(info);
		user.addRoomInfo(info);
		room.addUserInfo(info);
		
		// need?
		userRepo.save(user);
		roomRepo.save(room);
		
		return info;
	}
}
