package com.bp.msgr.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.dto.RoomRequestDto;
import com.bp.msgr.service.RoomService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "api/v1/room")
@RequiredArgsConstructor
public class RoomController {
	private final RoomService roomService;
	
	@GetMapping(value="/get/{room_id}")
	public Optional<Room> get(@PathVariable(name = "room_id")Long roomId){
		return roomService.get(roomId);
	}
	
	@GetMapping(value="/getAll")
	public ArrayList<Room> getAll(){
		return roomService.getAll();
	}
	
	@PostMapping
	public Room create(@RequestBody RoomRequestDto dto) {
		return roomService.create(dto);
	}
}
