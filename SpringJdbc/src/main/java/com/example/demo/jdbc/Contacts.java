package com.example.demo.jdbc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contacts {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String phoneno;
	private String role;
	private String reportsto;
	
	public Contacts(int id, String fname, String lname, String email, String phoneno, String role) {
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.phoneno=phoneno;
		this.role=role;
	}
	public Contacts() {}

}
