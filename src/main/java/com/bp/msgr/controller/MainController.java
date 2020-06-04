package com.bp.msgr.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.user.User;
import com.bp.msgr.dto.ChatInitRequestDto;
import com.bp.msgr.dto.ConnectRequestDto;
import com.bp.msgr.dto.UserRequestDto;
import com.bp.msgr.service.ConnectionService;
import com.bp.msgr.service.RoomService;
import com.bp.msgr.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/main/")
public class MainController {
	private final UserService userService;
	private final RoomService roomService;
	private final ConnectionService connService;

	@PostMapping(value = "user/register/")
	public User registerUser(@RequestBody UserRequestDto dto) {
		return userService.create(dto);
	}

	@GetMapping(value = "test/makeUsers/")
	public List<User> makeUsers(int theNumOfUsers) {
		for (int i = 1; i <= theNumOfUsers; i++) {
			userService.create(new UserRequestDto(Integer.toString(i), Integer.toString(i) + "@" + "bp.com"));
		}
		return userService.getAll();
	}

	@PostMapping(value = "initRoom/")
	public Room makeChatRoom(@RequestBody ChatInitRequestDto dto) {
		Room room = roomService.create(dto.getRoomName());
		Long roomId = room.getRoomId();
		System.out.println("room created roomId:"+roomId);
		
		for(Long userId : dto.getParticipantIds()) {
			connService.connect(
					ConnectRequestDto.builder()
					.userId(userId)
					.roomId(roomId)
					.build()
					);
		}
		return room;
	}

}
