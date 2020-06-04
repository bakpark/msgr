package com.bp.msgr.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.msgr.domain.user.User;
import com.bp.msgr.dto.UserRequestDto;
import com.bp.msgr.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value="api/v1/user")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;

	@GetMapping(value = "/get")
	public User get(Long userId) {
		return userService.get(userId);
	}
	
	@GetMapping(value="/getAll")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@PostMapping(value = "/create")
	public User create(@RequestBody UserRequestDto dto) {
		return userService.create(dto);
	}
	
}
