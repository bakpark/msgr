package com.bp.msgr.domain.room;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long uid;
	
	private String name;
	
//	@ManyToMany
//	private ArrayList<User> users;
	
//	@OneToMany(mappedBy="chat")
//	private ArrayList<Chat> chats;
	
	
}
