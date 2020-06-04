package com.bp.msgr.domain.participantInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

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
	
	@JsonBackReference
	@ManyToOne(targetEntity = User.class)
	private User user;
	
	@JsonBackReference
	@ManyToOne(targetEntity = Room.class)
	private Room room;
}
