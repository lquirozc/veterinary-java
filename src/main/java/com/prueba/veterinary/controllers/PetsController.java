package com.prueba.veterinary.controllers;

import com.prueba.veterinary.models.*;
import com.prueba.veterinary.services.PetsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/pets")
public class PetsController {
	
	private final PetsService petsService;

    @Autowired
    public PetsController(PetsService petsService) {
        this.petsService = petsService;
    }
	
    @GetMapping
    public List<Pets> getAll() {
        return petsService.getAll();
    }
}
