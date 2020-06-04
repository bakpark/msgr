package com.bp.msgr.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter // ChatService Test를 위해 추가.
public class ChatInitRequestDto {
	private String roomName;
	private List<Long> participantIds = new ArrayList<>();
	
}
