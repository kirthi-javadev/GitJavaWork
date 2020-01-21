package com.hibernate.mypackage;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Employee 
	{
		
	@Id
		private String firstName,lastName; 
		private int id;  
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		
	}


