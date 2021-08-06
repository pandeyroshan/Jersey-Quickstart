package org.ics.roshan.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.ics.roshan.messenger.model.Message;

public class MessageService {
	public List<Message> getAllMessages(){
		Message m1 = new Message(1, "Hi", "Roshan");
		Message m2 = new Message(2, "Hello", "Rohan");
		Message m3 = new Message(3, "How are you", "Roshan");
		Message m4 = new Message(4, "I'm good, hbu?", "Rohan");
		
		List<Message> messages = new ArrayList<>();
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		messages.add(m4);
		
		return messages;
	}
}
