package com.bp.msgr.domain.chat;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long chatId;
	
	private String msg;
	
	@Column(name = "send_at", nullable = false, updatable = false)
	@CreationTimestamp
	private Date sendAt;
	
	// 1:N 관계, but User에서는 관리 안함.
	@ManyToOne(targetEntity = User.class)
	private User sender;
	
	// 1:N 관계, Room에서도 관리 할 것
	@JsonBackReference
	@ManyToOne(targetEntity = Room.class)
	private Room room;
	
	
}
