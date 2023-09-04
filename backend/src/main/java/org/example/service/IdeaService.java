package org.example.service;

import org.example.model.Idea;
import org.example.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeaService {

    @Autowired
    public IdeaRepository ideaRepository;

    public Idea createIdea(Idea idea){
        Idea createdIdead = ideaRepository.saveAndFlush(idea);
        return createdIdead;
    }

    public List<Idea> getAllIdeasById(Long id) {
        List<Idea> ideas = ideaRepository.findIdeasById(id);
        return ideas;
    }

    public List<Idea> getAllIdeas() {
        List<Idea> ideas = ideaRepository.findAll();
        return ideas;
    }

    public void deleteIdea(Long ideaId) {
        // Delete a project by ID
        ideaRepository.deleteById(ideaId);
    }

    public Idea updateIdea(Idea updatedIdea) {
        // Update an existing project
        // You can add validation logic here if needed
        return ideaRepository.saveAndFlush(updatedIdea);
    }
}
