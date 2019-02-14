package com.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private String name;
	private String author;
	
	public Message(){
		
	}
	
	public Message(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
