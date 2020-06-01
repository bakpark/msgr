package com.bp.msgr.dto;

import com.bp.msgr.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserRequestDto {

	private Long userId;
	private String name;
	private String email;
	
	public User toEntity() {
		return User.builder()
				.name(name)
				.email(email)
				.build();
	}
	
}
