package org.example.controller;

import org.example.model.Idea;
import org.example.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IdeaController {

    @Autowired
    IdeaService ideaService;

    @GetMapping("/ideas")
    public List<Idea> getAllIdeas(){
        return ideaService.getAllIdeas();
    }

    @GetMapping("/ideas/{id}")
    public List<Idea> getAllIdeasById(@PathVariable Long id){
        return ideaService.getAllIdeasById(id);
    }

    @PostMapping("/create-idea")
    public Idea createIdea(@RequestBody Idea newIdea){
        return ideaService.createIdea(newIdea);
    }

    @PostMapping("/update-idea")
    public Idea updateIdea(@RequestBody Idea updatedIdea){
        return ideaService.updateIdea(updatedIdea);
    }

    @DeleteMapping("/delete-idea")
    public void deleteIdea(@PathVariable Long id){
        ideaService.deleteIdea(id);
    }


}
