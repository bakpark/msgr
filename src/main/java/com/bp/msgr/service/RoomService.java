package com.bp.msgr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.room.RoomRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RoomService {
	private final RoomRepository roomRepo;
	
	public Room get(Long roomId){
		return roomRepo.getOne(roomId);
	}

	public Room create(String roomName) {
		return roomRepo.save(new Room(roomName));
	}
	
	public List<Room> getAll(){
		return roomRepo.findAll();
	}
}
