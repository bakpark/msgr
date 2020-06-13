package com.bp.msgr.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.bp.msgr.dto.socket.Greeting;
import com.bp.msgr.dto.socket.HelloMessage;

@Controller
public class SocketController {

	@MessageMapping("/hello")
	@SendTo("/topic/greeting")
	public Greeting greeting(HelloMessage message) throws Exception{
		Thread.sleep(1000); // simulated delay
	    return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}
}
