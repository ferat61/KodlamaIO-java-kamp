package kay�tGirisDemo.core.concretes;

import kay�tGirisDemo.Business.abstracts.UsersService;
import kay�tGirisDemo.Entities.cocncretes.Users;
import kay�tGirisDemo.core.abstracts.GoogleAuthService;
import kay�tGirisDemo.core.abstracts.UsersValidedService;
import kay�tGirisDemo.core.abstracts.ValitedService;

public class AuthManager implements GoogleAuthService {
	UsersService usersService;
	UsersValidedService usersvalitedservice;
	ValitedService valitedservice;

	
	public AuthManager() {
		
	}
	

	public AuthManager(UsersService usersService, UsersValidedService usersvalitedservice,
			ValitedService valitedservice) {
		super();
		this.usersService = usersService;
		this.usersvalitedservice = usersvalitedservice;
		this.valitedservice = valitedservice;
	}
	@Override
	public void register(int id, String Firstname, String Lastname, String Eposta, String Password) {
		Users usersregister=new Users(id, Firstname, Lastname, Eposta, Password);
		if(!this.usersvalitedservice.registerValited(usersregister))
		{
			System.out.println("Kullan�c� bilgilerini kontrol edin");
		}
		if(!checIfUsersExits(Eposta)) {
			System.out.println("Bu e-posta kay�tl�d�r ba�ka bir e-posta giriniz.");
			return;
			
		}
		if (!this.valitedservice.Valited(usersregister)) {
			System.out.println("Do�rulama yap�lamad� kay�t ba�ar�s�z olundu.");
			return;
		}
		usersService.add(usersregister);
		
	}

	private boolean checIfUsersExits(String eposta) {

		return usersService.getbyEposta(eposta)==null;
		
	}


	@Override
	public void login(String Eposta, String password) {
		if(!this.usersvalitedservice.loginValited(Eposta, password))
		{
			System.out.println("Bilgilerinizi kontrol edin");
			return;
		}
		Users userToLogin=usersService.getbyEpostaAndPassword(Eposta, password);
		
		if (userToLogin == null) {
			System.out.println("E-posta ve �ifrenizi kontrol edin");
			return;
		}
		if(!checkIfUserVerified(userToLogin)) 
		{
			System.out.println("�yelik giri�i tamamlanmad��� i�in ba�ar�s�z olundu");
			return;
		}
		System.out.println("Giri� ba�ar�l� tebrikler " + userToLogin.getFirstname() + " " + userToLogin.getLastname());
		
	}


	private boolean checkIfUserVerified(Users userToLogin) {
		return valitedservice.Valited(userToLogin);
	}

}
