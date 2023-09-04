package org.example.controller;

import org.example.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdeaController {

    @Autowired
    IdeaService ideaService;


}
