package com.bp.msgr.dto;

import com.bp.msgr.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {

	private String name;
	private String email;
	
	public User toEntity() {
		return User.builder()
				.name(name)
				.email(email)
				.build();
	}
	
}
