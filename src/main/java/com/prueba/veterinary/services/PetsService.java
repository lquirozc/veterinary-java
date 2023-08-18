package com.prueba.veterinary.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.prueba.veterinary.models.*;

@Component
public interface PetsService {
	 List<Pets> getAll();
}
