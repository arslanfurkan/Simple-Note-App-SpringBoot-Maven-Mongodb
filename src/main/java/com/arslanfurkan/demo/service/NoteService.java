package com.arslanfurkan.demo.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arslanfurkan.demo.model.Note;
import com.arslanfurkan.demo.repository.NoteRepository;

@Service
public class NoteService {
	
	@Autowired
	private NoteRepository noteRepository;
	
	//CREATE
	public Note create(String title, String content) {
		return noteRepository.save(new Note(title,content,GetCurrentDate()));
	}
	
	//List all notes
	public List<Note> getAll() {
		return noteRepository.findAll();
	}

	public Note getById(String id) {
		Optional<Note> optinalEntity =  noteRepository.findById(id);
		Note note = optinalEntity.get();		
		return note;
	}
	
	
	//UPDATE
	
	public Note update(String id,String title, String content) {
		Optional<Note> optinalEntity = noteRepository.findById(id);
		Note note = optinalEntity.get();
		note.setTitle(title);
		note.setContent(content);
		note.setModifiedDate(GetCurrentDate());
		return noteRepository.save(note);
		
	}
	
	
	//DELETE
	public void delete(String id) {
		Optional<Note> optinalEntity = noteRepository.findById(id);
		Note note = optinalEntity.get();
		noteRepository.delete(note);
	}
	
	
	public String GetCurrentDate() {
		
		final String DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
		formatter.setTimeZone(TimeZone.getTimeZone("GMT+3"));
		Calendar currentTime = Calendar.getInstance();		 
		String timeStr = formatter.format(currentTime.getTime());  
		return timeStr;
	}
	
	
	
	
}