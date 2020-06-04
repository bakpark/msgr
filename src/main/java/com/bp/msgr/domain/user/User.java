package com.bp.msgr.domain.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bp.msgr.domain.participantInfo.ParticipantInfo;
import com.bp.msgr.domain.visit.Visit;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String name;
	private String email;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "user")
	@Builder.Default
	private List<ParticipantInfo> roomInfo = new ArrayList<>();
		
	@JsonManagedReference
	@OneToMany(mappedBy = "visitor")
	@Builder.Default
	private List<Visit> visits = new ArrayList<>();

	public void addRoomInfo(ParticipantInfo info) {
		roomInfo.add(info);
	}
}
