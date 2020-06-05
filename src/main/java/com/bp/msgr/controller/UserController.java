package com.bp.msgr.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.msgr.domain.user.User;
import com.bp.msgr.dto.UserRequestDto;
import com.bp.msgr.service.UserService;

import lombok.RequiredArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping(value="api/v1/user")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;

	@GetMapping(value = "/get")
	public ResponseEntity<User> get(Long userId) {
		User user = userService.get(userId);
		ResponseEntity<User> response = new ResponseEntity<>(user, HttpStatus.OK);
		return response;
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
