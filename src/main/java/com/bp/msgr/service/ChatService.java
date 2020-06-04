package com.bp.msgr.service;

import org.springframework.stereotype.Service;

import com.bp.msgr.domain.chat.Chat;
import com.bp.msgr.domain.chat.ChatRepository;
import com.bp.msgr.domain.room.Room;
import com.bp.msgr.domain.room.RoomRepository;
import com.bp.msgr.domain.user.User;
import com.bp.msgr.domain.user.UserRepository;
import com.bp.msgr.dto.ChatRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ChatService {
	private final ChatRepository chatRepo;
	private final RoomRepository roomRepo;
	private final UserRepository userRepo;
	
	public Chat sendMsg(ChatRequestDto dto) {
		Room room = roomRepo.getOne(dto.getRoomId());
		User user = userRepo.getOne(dto.getSenderId());
		
		Chat chat = Chat.builder()
					.sender(user)
					.room(room)
					.msg(dto.getMsg())
					.build();
		chatRepo.save(chat);
		room.addChat(chat);
		return chat;
	}
	
}
