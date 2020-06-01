package com.bp.msgr.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.room.RoomRepository;
import com.bp.msgr.dto.RoomRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RoomService {
	private final RoomRepository roomRepo;
	
	public Optional<Room> get(Long roomId){
		return roomRepo.findById(roomId);
	}
	
	public Room create(RoomRequestDto dto) {
		return roomRepo.save(dto.toEntity());
	}
	
//	public Room rename(RoomRequestDto dto) {
//		Room room = roomRepo.getOne(dto.getRoomId());
//		room.setName(dto.getName());
//		return roomRepo.save(room);
//	}
	
	public ArrayList<Room> getAll(){
		return (ArrayList<Room>) roomRepo.findAll();
	}
}
