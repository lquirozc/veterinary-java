package com.prueba.veterinary.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.veterinary.models.*;

import java.util.Date;
import java.util.List;

@Repository
public interface PetsRepository extends JpaRepository<Pets, UUID> {

	@Query(nativeQuery = true, value = "CALL GetAllPets()")
    List<Pets> getAll();
	
	@Query(nativeQuery = true, value = "CALL GetPetById(:param)")
	Pets getPetDetail(@Param("param") String param);
	
	@Procedure(name = "InsertPet")
    void insertPet(String newPetName, Date newBornDate, String newIdPetType, String newIdOwner);
	
	@Procedure(name = "UpdatePet")
    void updatePet(String param, String newPetName, Date newBornDate, String newIdPetType, String newIdOwner);

	@Procedure(name = "DeletePet")
    void deletePet(String param);
}
