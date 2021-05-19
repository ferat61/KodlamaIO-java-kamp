package entities;

public class Gamer {
	int id;
	String Firstname;
	String Lastname;
	String email;
	int Birthyear;
	long Identitiynumber;
	
	public Gamer(int id, String firstname, String lastname, String email, int birthyear, long identitiynumber) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		this.email = email;
		Birthyear = birthyear;
		Identitiynumber = identitiynumber;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirthyear() {
		return Birthyear;
	}
	public void setBirthyear(int birthyear) {
		Birthyear = birthyear;
	}
	public long getIdentitiynumber() {
		return Identitiynumber;
	}
	public void setIdentitiynumber(long identitiynumber) {
		Identitiynumber = identitiynumber;
	}

}
