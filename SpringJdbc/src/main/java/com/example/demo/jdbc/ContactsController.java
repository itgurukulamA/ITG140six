package com.example.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
	@Autowired
	Contactsservice cs;
	
	@PostMapping("/contact")
	public String addContact(@RequestBody Contacts con) {
		String s=cs.addContact1(con);
		return s;
	}
	@PostMapping("/csearch")
	public List<Contacts> serachResult(@RequestBody Contacts con){
		return cs.search(con);
	}
	@PostMapping("/conadd")
	public String addContact22(@RequestBody Contacts con) {
		return cs.search23(con);
		
	}
	
}
