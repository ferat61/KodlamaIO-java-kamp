package kayýtGirisDemo.core.concretes;

import kayýtGirisDemo.Business.abstracts.UsersService;
import kayýtGirisDemo.Entities.cocncretes.Users;
import kayýtGirisDemo.core.abstracts.GoogleAuthService;
import kayýtGirisDemo.core.abstracts.UsersValidedService;
import kayýtGirisDemo.core.abstracts.ValitedService;

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
			System.out.println("Kullanýcý bilgilerini kontrol edin");
		}
		if(!checIfUsersExits(Eposta)) {
			System.out.println("Bu e-posta kayýtlýdýr baþka bir e-posta giriniz.");
			return;
			
		}
		if (!this.valitedservice.Valited(usersregister)) {
			System.out.println("Doðrulama yapýlamadý kayýt baþarýsýz olundu.");
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
			System.out.println("E-posta ve þifrenizi kontrol edin");
			return;
		}
		if(!checkIfUserVerified(userToLogin)) 
		{
			System.out.println("üyelik giriþi tamamlanmadýðý için baþarýsýz olundu");
			return;
		}
		System.out.println("Giriþ baþarýlý tebrikler " + userToLogin.getFirstname() + " " + userToLogin.getLastname());
		
	}


	private boolean checkIfUserVerified(Users userToLogin) {
		return valitedservice.Valited(userToLogin);
	}

}
