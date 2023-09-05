package org.example.service;

import org.example.model.Note;
import org.example.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;
    public NoteService(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }


    public Note createNote(Note Note){
        Note createdNoted = noteRepository.saveAndFlush(Note);
        return createdNoted;
    }

    public List<Note> getAllNotesById(Long id) {
        List<Note> Notes = noteRepository.findAllNotesById(id);
        return Notes;
    }

    public List<Note> getAllNotes() {
        List<Note> Notes = noteRepository.findAll();
        return Notes;
    }

    public void deleteNote(Long NoteId) {
        // Delete a project by ID
        noteRepository.deleteById(NoteId);
    }

    public Note updateNote(Note updatedNote) {
        // Update an existing project
        // You can add validation logic here if needed
        return noteRepository.saveAndFlush(updatedNote);
    }
}
