package com.springboot.example.springboot_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.springboot_demo.entity.Contact;


@Repository
public interface ContactRepo extends JpaRepository<Contact,Long>{

}
