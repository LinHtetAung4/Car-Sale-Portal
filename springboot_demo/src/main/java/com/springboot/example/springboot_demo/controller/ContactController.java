package com.springboot.example.springboot_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.example.springboot_demo.entity.Contact;
import com.springboot.example.springboot_demo.repo.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
public ContactService c_service;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	//mapping for display contact form
	@GetMapping("/contact")
	public String contactForm(Model model) {
		model.addAttribute("contact",new Contact());
		return"contact";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	
	//mapping for save and update the contact 
	@PostMapping("/contact")
	public String saveContact(@ModelAttribute Contact contact) {
		//Save data to the database
		c_service.SaveContact(contact);
		
		return"redirect:/allcontact";
	}
	//get all contact
	@GetMapping("/allcontact")
	public String allContat(Model model) {
		List<Contact>listcontact=c_service.getAllContact();
		model.addAttribute("listcontact",listcontact);
		return"allcontact";
	}
	
	//Delete contact
	@GetMapping("/delcontact/{contact_id}")
	public String delcontact(@PathVariable long contact_id) {
		c_service.delContact(contact_id);
		
		return"redirect:/allcontact";
	}
	//To display the update contact form
	@GetMapping("/updateontact/{contact_id}")
	public String updateContactForm(@PathVariable Long contact_id,Model model) {
		Contact old_data=c_service.getContactById(contact_id);
		model.addAttribute("contact", old_data);
		return "contact";
		
	}

}
