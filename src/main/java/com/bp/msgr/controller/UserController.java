package com.bp.msgr.controller;

import java.util.List;
import java.util.NoSuchElementException;

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
@RequestMapping(value = "api/v1/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping(value = "/get")
	public ResponseEntity<User> get(Long userId) {
		User user = userService.get(userId);
		ResponseEntity<User> response = new ResponseEntity<>(user, HttpStatus.OK);
		return response;
	}

	@GetMapping(value = "/find")
	public ResponseEntity<User> find(String name, String email) {
		ResponseEntity<User> response = null;
		UserRequestDto dto = UserRequestDto.builder().name(name).email(email).build();
		try {
			User user = userService.find(dto).orElseThrow();
			response = new ResponseEntity<>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<List<User>> getAll() {
		List<User> list = userService.getAll();
		ResponseEntity<List<User>> response = new ResponseEntity<>(list, HttpStatus.OK);
		return response;
	}

	@PostMapping(value = "/create")
	public User create(@RequestBody UserRequestDto dto) {
		return userService.create(dto);
	}

	@PostMapping(value = "/register")
	public ResponseEntity<User> register(@RequestBody UserRequestDto dto) {
		ResponseEntity<User> response = null;
		if (canRegisterUser(dto)) {
			User user = userService.create(dto);
			response = new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
		return response;

	}

	private boolean canRegisterUser(UserRequestDto dto) {
		try {
			userService.find(dto).orElseThrow();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		}
	}

}
