package com.rest.proj;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.Services.MessageServices;
import com.rest.model.Message;
@Path("/message")
public class Messanger {
	MessageServices messageServices=new MessageServices();
	@GET
	 @Produces(MediaType.APPLICATION_XML)
	
		public List<Message> getMessage(){
			return messageServices.getAllMessages() ;
		}
}
