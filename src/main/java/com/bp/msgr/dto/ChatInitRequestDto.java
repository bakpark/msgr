package com.bp.msgr.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ChatInitRequestDto {
	private String roomName;
	private List<Long> participantIds = new ArrayList<>();
	
}
