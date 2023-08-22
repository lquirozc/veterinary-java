package com.prueba.veterinary.models;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pets {

	@Id
	@Column(name = "idPet")
	private String idPet;
		
    public String getIdPet() {
		return idPet;
	}
	public void setIdPet(String idPet) {
		this.idPet = idPet;
	}
	public String getIdPetType() {
		return idPetType;
	}
	public void setIdPetType(String idPetType) {
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
	public String getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(String idOwner) {
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
	
	private String idPetType;
    private String petName;
    private Date bornDate;
    private String idOwner;
    private String ownerName;
    private String petType;
	
}
