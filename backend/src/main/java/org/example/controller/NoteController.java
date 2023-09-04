package org.example.controller;

import lombok.Data;
import org.example.model.Note;
import org.example.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    NoteService noteService;

    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/notes/{id}")
    public List<Note> getNoteById(@PathVariable Long id){
        return noteService.getAllNotesById(id);
    }

    @PostMapping("/create-note")
    public Note createNote(@RequestBody Note newNote){
        return noteService.createNote(newNote);
    }


    @PostMapping("/update-note")
    public Note updateNote(@RequestBody Note updatedNote){
        return noteService.updateNote(updatedNote);
    }

    @DeleteMapping("/delete-note/{id}")
    public void deleteNote(@PathVariable Long id){
        noteService.deleteNote(id);
    }





}
