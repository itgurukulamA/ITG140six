package com.example.demo.employee;


public class Employee {
private int id;
private String name;
private int age;
private int phno;
private String email;
private String desig;
private int salary;
public Employee(int id, String name, int age, int phno, String email, String desig, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.phno = phno;
	this.email = email;
	this.desig = desig;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}
