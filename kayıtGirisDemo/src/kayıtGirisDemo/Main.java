package kay�tGirisDemo;

import kay�tGirisDemo.Business.abstracts.UsersService;
import kay�tGirisDemo.Business.concretes.UserManager;
import kay�tGirisDemo.DataAccessDao.concretes.UsersDaoManager;
import kay�tGirisDemo.core.abstracts.GoogleAuthService;
import kay�tGirisDemo.core.concretes.AuthManager;
import kay�tGirisDemo.core.concretes.EmailValitedManager;
import kay�tGirisDemo.core.concretes.UserValitedManager;

public class Main {

	public static void main(String[] args) {
		UsersService service=new UserManager(new UsersDaoManager());
		GoogleAuthService authService=new AuthManager(service,new UserValitedManager(),new EmailValitedManager());
		authService.register(1, "Muhammet", "Ferat", "muhammetferat@gmail.com", "123456");
		authService.login("muhammetferat@gmail.com", "123456");

	}

}
