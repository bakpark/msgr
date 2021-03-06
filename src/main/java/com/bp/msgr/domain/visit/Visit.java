package com.bp.msgr.domain.visit;

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
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Visit {
//	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long vistId;

	@Column(name = "visit_at", nullable = false, updatable = false)
	@CreationTimestamp
	private Date visitAt;
	
	
	@JsonManagedReference
	@ManyToOne(targetEntity = User.class)
	private User visitor;
	
	@JsonManagedReference
	@ManyToOne(targetEntity = Room.class)
	private Room room;
	
}
