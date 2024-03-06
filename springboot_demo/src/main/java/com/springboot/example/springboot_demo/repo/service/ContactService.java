package com.springboot.example.springboot_demo.repo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.springboot_demo.entity.Contact;
import com.springboot.example.springboot_demo.repo.ContactRepo;

@Service
public class ContactService {

	@Autowired
	public ContactRepo c_repo;
	
	//CRUD
	
	//For save and update the contact (create , update =CU operation)
	
	public void SaveContact(Contact contact) {
		c_repo.save(contact);
	}
	
	//Method or get all contact (view all contact) (Retrieve =R operation)
	public List<Contact>getAllContact(){
		return c_repo.findAll();
	}
	
	
	//Method for delete id (delete =D)
	public void delContact(Long contact_id) {
		c_repo.deleteById(contact_id);
	}
	
	
	//Method to display contact old data
	//get old data according to the ID
	public Contact getContactById(Long contact_id) {

		return c_repo.getById(contact_id);
	}
}
