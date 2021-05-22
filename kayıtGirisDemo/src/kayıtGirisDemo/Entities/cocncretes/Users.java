package kayýtGirisDemo.Entities.cocncretes;

import kayýtGirisDemo.Entities.abstracts.Entity;

public class Users implements Entity {
private int id;
private String Firstname;
private String Lastname;
private String Eposta;
private String password;

public Users() {
	
}
public Users(int id, String firstname, String lastname, String eposta, String password) {
	super();
	this.id = id;
	this.Firstname = firstname;
	this.Lastname = lastname;
	this.Eposta = eposta;
	this.password = password;
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
public String getEposta() {
	return Eposta;
}
public void setEposta(String eposta) {
	Eposta = eposta;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
