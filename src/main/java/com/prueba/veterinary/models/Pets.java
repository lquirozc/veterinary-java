package com.prueba.veterinary.models;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pets {

	@Id
	@Column(name = "idPet")
	private UUID idPet;
		
    public UUID getIdPet() {
		return idPet;
	}
	public void setIdPet(UUID idPet) {
		this.idPet = idPet;
	}
	public UUID getIdPetType() {
		return idPetType;
	}
	public void setIdPetType(UUID idPetType) {
		this.idPetType = idPetType;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public UUID getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(UUID idOwner) {
		this.idOwner = idOwner;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	private UUID idPetType;
    private String petName;
    private Date bornDate;
    private UUID idOwner;
    private String ownerName;
    private String petType;
	
}
