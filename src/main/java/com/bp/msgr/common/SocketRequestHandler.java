package com.bp.msgr.common;

import java.util.HashMap;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

@Component
public class SocketRequestHandler extends AbstractWebSocketHandler{

	HashMap<String, WebSocketSession> sessionMap;
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(session);
		super.afterConnectionEstablished(session);
		sessionMap.put(session.getId(), session);
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ok here");
		System.out.println(session);
		System.out.println(message);
	}

//	@Override
//	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
//		// TODO Auto-generated method stub
//		exception = new Exception("handleTransportError");
//		throw exception;
//		
//	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean supportsPartialMessages() {
		// TODO Auto-generated method stub
		return false;
	}

}
