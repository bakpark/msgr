package com.bp.msgr.domain.room;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bp.msgr.domain.chat.Chat;
import com.bp.msgr.domain.participantInfo.ParticipantInfo;
import com.bp.msgr.domain.visit.Visit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Room {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long room_id;
	
	private String name;
	

	@OneToMany(mappedBy="room")
	private List<ParticipantInfo> infos;
	
	@OneToMany(mappedBy="room")
	private List<Chat> chats;
	
	@OneToMany(mappedBy="room")
	private List<Visit> visits;
}
