package com.arslanfurkan.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arslanfurkan.demo.model.Note;

@Repository
public interface NoteRepository extends MongoRepository<Note,String> {
	public Note findByTitle(String title);
	public List<Note> findByModifiedDate(String modifiedDate);
}
