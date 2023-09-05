package org.example.controller;

import org.example.model.Idea;
import org.example.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IdeaController {


    private final IdeaService ideaService;
    public IdeaController(IdeaService ideaService){
        this.ideaService = ideaService;
    }


    @GetMapping("/ideas")
    public List<Idea> getAllIdeas(){
        return ideaService.getAllIdeas();
    }

    @GetMapping("/ideas/{id}")
    public List<Idea> getAllIdeasById(@PathVariable Long id){
        return ideaService.getAllIdeasById(id);
    }

    @PostMapping("/idea")
    public Idea createIdea(@RequestBody Idea newIdea){
        return ideaService.createIdea(newIdea);
    }

    @PutMapping("/ideas")
    public Idea updateIdea(@RequestBody Idea updatedIdea){
        return ideaService.updateIdea(updatedIdea);
    }

    @DeleteMapping("/ideas/{id}")
    public void deleteIdea(@PathVariable Long id){
        ideaService.deleteIdea(id);
    }


}
