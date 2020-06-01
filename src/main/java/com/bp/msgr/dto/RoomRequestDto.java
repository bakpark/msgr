package com.bp.msgr.dto;

import com.bp.msgr.domain.room.Room;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RoomRequestDto {

	private Long roomId;
	private String name;
	
	public Room toEntity() {
		return Room.builder()
				.name(name)
				.build();
	}
}
