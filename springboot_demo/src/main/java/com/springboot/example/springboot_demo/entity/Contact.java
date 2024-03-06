package com.springboot.example.springboot_demo.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String email;
	
	
	//Inverse Side
	@OneToMany(mappedBy="contact")
	Set<PhoneNumber> phone_number;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Set<PhoneNumber> getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(Set<PhoneNumber> phone_number) {
		this.phone_number = phone_number;
	}
	
	

}
