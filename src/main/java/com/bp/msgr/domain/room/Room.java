package com.bp.msgr.domain.room;

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
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
public class Room {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long roomId;
	
	private String name;
	
	public Room(String roomName) {
		name = roomName;
		userInfos = new ArrayList<>();
		chats = new ArrayList<>();
		visits = new ArrayList<>();
	}

	@JsonManagedReference
	@OneToMany(mappedBy="room")
	@Builder.Default
	private List<ParticipantInfo> userInfos = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy="room")
	@Builder.Default
	private List<Chat> chats = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy="room")
	@Builder.Default
	private List<Visit> visits = new ArrayList<>();

	public void addUserInfo(ParticipantInfo info) {
		userInfos.add(info);
	}

	public void addChat(Chat chat) {
		chats.add(chat);
	}

}
