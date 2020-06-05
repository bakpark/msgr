package com.bp.msgr.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.msgr.domain.visit.Visit;
import com.bp.msgr.dto.VisitDto;
import com.bp.msgr.service.VisitService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/visit/")
public class VisitController {
	private final VisitService visitService;
	
	@PostMapping(value = "create/")
	public Visit create(@RequestBody VisitDto dto) {
		return visitService.create(dto);
	}
}
