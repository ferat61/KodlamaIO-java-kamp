package kay�tGirisDemo.core.concretes;

import kay�tGirisDemo.GoogleAuth.GoogleAuthManager;
import kay�tGirisDemo.core.abstracts.GoogleAuthService;

public class GoogleAuthManagerAdapter implements GoogleAuthService {

	GoogleAuthManager manager=new GoogleAuthManager();
	@Override
	public void register(int id, String Firstname, String Lastname, String Eposta, String Password) {
		manager.register(id, Firstname, Lastname, Eposta, Password);
		
		System.out.println("Google hesab� ile kaydolundu" + Eposta);
		
	}

	@Override
	public void login(String Eposta, String password) {
		manager.Login(Eposta, password);
		System.out.println("Google ile kay�t olundu"+ Eposta);
		
	}
	

}
