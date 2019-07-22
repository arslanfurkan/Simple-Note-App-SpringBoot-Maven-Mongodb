package com.arslanfurkan.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.arslanfurkan.demo.model.Note;
import com.arslanfurkan.demo.service.NoteService;

@RestController
@RequestMapping("/rest")
public class NoteRestController {
	@Autowired
	private NoteService noteService;
	
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public void create(@RequestParam String title, @RequestParam String content) {
		noteService.create(title, content);	
	}
	
	@RequestMapping("/get")	
	public ResponseEntity<Note> getNote(@RequestParam String id) {
		return ResponseEntity.ok(noteService.getById(id));
	}
		
	@RequestMapping(value="/getAll")
	public ResponseEntity<List<Note>> getAll(){	
		List<Note> notes=noteService.getAll();
		ResponseEntity.ok(notes);
		return ResponseEntity.ok(notes);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/update")
	public void update(@RequestParam String id,@RequestParam String title, @RequestParam String content) {
		noteService.update(id,title, content);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete")
	public void delete (@RequestParam String id) {
		noteService.delete(id);
	}
	
}
