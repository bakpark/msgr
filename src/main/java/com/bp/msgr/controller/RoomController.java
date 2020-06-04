package com.bp.msgr.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.service.RoomService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "api/v1/room")
@RequiredArgsConstructor
public class RoomController {
	private final RoomService roomService;
	

	@GetMapping(value = "/get")
	public Room get(Long roomId) {
		return roomService.get(roomId);
	}
	
	@GetMapping(value="/getAll")
	public List<Room> getAll(){
		return roomService.getAll();
	}
	
	@GetMapping(value="/testcreate")
	public Room create(String roomName) {
		return roomService.create(roomName);
	}
}
