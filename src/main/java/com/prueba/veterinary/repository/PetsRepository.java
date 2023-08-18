package com.prueba.veterinary.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.veterinary.models.*;

import java.util.List;

@Repository
public interface PetsRepository extends JpaRepository<Pets, UUID> {

	@Query(nativeQuery = true, value = "CALL GetAllPets()")
    List<Pets> getAll();
}
