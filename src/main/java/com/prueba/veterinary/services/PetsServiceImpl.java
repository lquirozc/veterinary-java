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
		try {

			return petsRepository.getAll();

		} catch (Exception ex) {

			throw new RuntimeException("Error al obtener la lista de mascotas: ", ex);
		}
	}

	@Override
	public Pets getById(String petId) {
		try {
			return petsRepository.getPetDetail(petId);
		} catch (Exception ex) {

			throw new RuntimeException("Error al obtener una mascota: ", ex);
		}
	}

	@Override
	public void save(Pets pet) {
		try {
			petsRepository.insertPet(
					pet.getPetName(), 
					pet.getBornDate(), 
					pet.getIdPetType(), 
					pet.getIdOwner());
		} catch (Exception ex) {

			throw new RuntimeException("Error al guardar una mascota: ", ex);
		}
	}

	@Override
	public void update(Pets pet) {
		try {
			petsRepository.updatePet(pet.getIdPet(), pet.getPetName(), pet.getBornDate(), pet.getIdPetType(),
					pet.getIdOwner());
		} catch (Exception ex) {

			throw new RuntimeException("Error al actualizar la mascota: ", ex);
		}

	}

	@Override
	public void delete(String petId) {
		try {
			petsRepository.deletePet(petId);
		} catch (Exception ex) {

			throw new RuntimeException("Error al eliminar la mascota: ", ex);
		}
	}

}
