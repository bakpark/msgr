package com.bp.msgr.service;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.room.RoomRepository;
import com.bp.msgr.domain.user.User;
import com.bp.msgr.domain.user.UserRepository;
import com.bp.msgr.domain.visit.Visit;
import com.bp.msgr.domain.visit.VisitRepository;
import com.bp.msgr.dto.VisitDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VisitService {
	private final VisitRepository visitRepo;
	private final UserRepository userRepo;
	private final RoomRepository roomRepo;
	
	public Visit create(VisitDto dto) {
		User user = userRepo.getOne(dto.getUserId());
		Room room = roomRepo.getOne(dto.getRoomId());
		Visit visit = Visit.builder()
						.visitor(user)
						.room(room)
						.build();
		visitRepo.save(visit);
		user.recordVisitInfo(room, visit);
		room.recordVisit(user, visit);
		return visit;
	}
}
