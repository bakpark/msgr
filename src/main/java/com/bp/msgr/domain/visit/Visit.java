package com.bp.msgr.domain.visit;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;

@Entity
@Getter
public class Visit {
	
	@Id
	@Column(name="uid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long uid;
	
	private Date time;
	
	@Column(name="visitor_id")
	private Long visitorId;
	
	@Column(name="room_id")
	private Long roomId;
	
}
