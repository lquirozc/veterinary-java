package com.prueba.veterinary.controllers.api;

import com.prueba.veterinary.models.*;
import com.prueba.veterinary.services.PetsService;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/pets")
@Api(tags = "Pets API")
public class PetsController {
	
	private final PetsService petsService;

    @Autowired
    public PetsController(PetsService petsService) {
        this.petsService = petsService;
    }
	
    @GetMapping
    public ResponseEntity<List<Pets>> getAll() {
        List<Pets> allPets = petsService.getAll();
        
        if (allPets.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(allPets);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Pets> getById(@PathVariable String id) {
        Pets petDetails = petsService.getById(id);
        
        if (petDetails == null) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(petDetails);
    }
    
    @PostMapping
    public ResponseEntity<String> savePet(@RequestBody Pets newPet) {
        petsService.save(newPet);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pet saved successfully");
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable String id, @RequestBody Pets updatedPet) {

        updatedPet.setIdPet(id);
        
        petsService.update(updatedPet);
        return ResponseEntity.ok("Pet updated successfully");
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        petsService.delete(id);
        return ResponseEntity.ok("Pet deleted successfully");
    }
    
}
