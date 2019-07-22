package com.arslanfurkan.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Note {
	@Id
	String id;


	String title;
	String content;
	String modifiedDate;
	
	public Note() {}
	public Note(String title, String content, String modifiedDate) {
		super();
		this.title = title;
		this.content = content;
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "ID: "+id+"<br>TITLE: "+title+"<br>CONTENT: "+content+"<br>MODIFIED DATE: "+modifiedDate;
	}
}
