package com.bp.msgr.domain.participantInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Entity
@AllArgsConstructor
@Builder
public class ParticipantInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long infoId;
	
	@ManyToOne(targetEntity = User.class)
	private User user;
	
	@ManyToOne(targetEntity = Room.class)
	private Room room;
}
