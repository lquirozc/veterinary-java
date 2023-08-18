package com.prueba.veterinary.services;

import com.prueba.veterinary.models.*;
import com.prueba.veterinary.repository.PetsRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetsServiceImpl implements PetsService {

	private final PetsRepository petsRepository;
	
	@Autowired
	public PetsServiceImpl(PetsRepository petsRepository) {
		this.petsRepository = petsRepository;
	}
	
	@Override
	public List<Pets> getAll() {
		return petsRepository.getAll();
	}

}
