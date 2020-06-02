package com.bp.msgr.domain.participantInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.user.User;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Entity
public class ParticipantInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long info_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;
}
