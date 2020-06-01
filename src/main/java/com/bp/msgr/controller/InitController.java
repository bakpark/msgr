package com.bp.msgr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.msgr.service.InitService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value="api/v1/init")
@RequiredArgsConstructor
public class InitController {
	private final InitService initService;
	
	@GetMapping("/")
	public void init() {
		initService.userInit();
	}
	

}
