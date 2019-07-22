package com.arslanfurkan.demo.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.arslanfurkan.demo.model.Note;
import com.arslanfurkan.demo.service.NoteService;

@Controller
public class NoteController {
	
	@Autowired
	private NoteService noteService;
	
	@RequestMapping(value="/getNotes",method=RequestMethod.GET)
	public ModelAndView getNotes() {
		
		ModelAndView view=new ModelAndView();
		view.addObject("notes",noteService.getAll());
		view.setViewName("noteListView");
		
		return view;
	}
	
	@RequestMapping(value="/getNote",method=RequestMethod.GET)	
	public String showNoteView(@RequestParam String id,ModelMap model) {	
		Note note = noteService.getById(id);
		model.addAttribute("id", note.getId());
        model.addAttribute("title", note.getTitle());
        model.addAttribute("content", note.getContent());
        model.addAttribute("modifiedDate", note.getModifiedDate());
        return "noteView";
	}
	
	
	@RequestMapping(value="/newNote",method=RequestMethod.GET)	
	public ModelAndView showAddNoteForm() {	
		return new ModelAndView("addNoteView","note",new Note());
	}
	@RequestMapping(value="/addNote",method=RequestMethod.POST)	
	public RedirectView SubmitNewNote(@Valid @ModelAttribute("note")Note note) {	
		noteService.create(note.getTitle(),note.getContent());
		return new RedirectView("/getNotes");
	}
	
	@RequestMapping(value="/deleteNote",method=RequestMethod.GET)	
	public RedirectView SubmitDeleteNote(@RequestParam String id) {	
		noteService.delete(id);
		return new RedirectView("/getNotes");
	}
	
	@RequestMapping(value="/editNote",method=RequestMethod.GET)	
	public ModelAndView showEditNoteView(@RequestParam String id) {	
		ModelAndView view=new ModelAndView();
		view.addObject("note",noteService.getById(id));
		view.setViewName("editNoteView");
        return view;
	}
	@RequestMapping(value="/editNote",method=RequestMethod.POST)	
	public RedirectView SubmitEditNote(@Valid @ModelAttribute("note")Note note) {	
		noteService.update(note.getId(),note.getTitle(),note.getContent());
        return new RedirectView("/getNotes");
	}
	
	

}
