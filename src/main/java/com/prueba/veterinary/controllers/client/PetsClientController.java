package com.prueba.veterinary.controllers.client;

import com.prueba.veterinary.services.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetsClientController {
	
	private final PetsService petsService;
	 
    @Autowired
    public PetsClientController(PetsService petsService) {
        this.petsService = petsService;
    }

    @GetMapping("/client")
    public String showClient(Model model) {
        model.addAttribute("pets", petsService.getAll());
        return "pets";
    }
}
