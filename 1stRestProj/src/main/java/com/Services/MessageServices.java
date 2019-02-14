package com.Services;

import java.util.ArrayList;
import java.util.List;

import com.rest.model.Message;

public class MessageServices {

	
	public List<Message> getAllMessages(){
		Message m1=new Message("prahta","Koushik");
		Message m2=new Message("prahta","Koushik");
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}
}
