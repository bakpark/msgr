package com.bp.msgr.domain.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bp.msgr.domain.chat.Chat;
import com.bp.msgr.domain.participantInfo.ParticipantInfo;
import com.bp.msgr.domain.visit.Visit;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String name;
	private String email;
	
	@JsonBackReference
	@OneToMany(mappedBy = "user")
	private List<ParticipantInfo> roomInfo = new ArrayList<>();
	
	@OneToMany(mappedBy = "sender")
	private List<Chat> chats;
	
	@OneToMany(mappedBy = "visitor")
	private List<Visit> visits;

	public void addRoomInfo(ParticipantInfo info) {
		roomInfo.add(info);
	}
}
