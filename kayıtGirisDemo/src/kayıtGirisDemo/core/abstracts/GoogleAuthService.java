package kayýtGirisDemo.core.abstracts;

public interface GoogleAuthService {
	void register(int id,String Firstname,String Lastname,String Eposta,String Password);
	void login(String Eposta,String password);

}
