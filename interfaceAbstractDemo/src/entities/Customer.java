package entities;

import java.time.LocalDate;

import abstractss.Entity;


public class Customer implements Entity {
	private int id;
	private String Firstname;
	private String Lastname;
	private LocalDate DateofBirth;
	private String NationalityId;
	
	public Customer(int id, String firstname, String lastname, int dateofBirt, String nationalityId, LocalDate DateofBirth) {
		super();
		this.id = id;
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.DateofBirth = DateofBirth;
		this.NationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public LocalDate getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirt(int dateofBirt) {
		DateofBirth = DateofBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


}
