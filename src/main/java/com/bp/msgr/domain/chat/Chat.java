package com.bp.msgr.domain.chat;

import java.time.LocalDateTime;

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
import lombok.Setter;

@Entity
@Getter
@RequiredArgsConstructor
@Setter
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long chat_id;
	
	private String msg;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User sender;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;
	
	private LocalDateTime time;
	
}
