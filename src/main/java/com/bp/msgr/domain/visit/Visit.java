package com.bp.msgr.domain.visit;

import java.time.LocalDateTime;

import javax.persistence.Column;
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

@Entity
@Getter
@RequiredArgsConstructor
public class Visit {
//	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long visit_id;
	
	private LocalDateTime time;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User visitor;
	
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;
	
}
