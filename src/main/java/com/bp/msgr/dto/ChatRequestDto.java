package com.bp.msgr.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatRequestDto {
	String msg;
	Long senderId;
	Long roomId;
}
