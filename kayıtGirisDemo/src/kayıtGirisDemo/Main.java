package kayýtGirisDemo;

import kayýtGirisDemo.Business.abstracts.UsersService;
import kayýtGirisDemo.Business.concretes.UserManager;
import kayýtGirisDemo.DataAccessDao.concretes.UsersDaoManager;
import kayýtGirisDemo.core.abstracts.GoogleAuthService;
import kayýtGirisDemo.core.concretes.AuthManager;
import kayýtGirisDemo.core.concretes.EmailValitedManager;
import kayýtGirisDemo.core.concretes.UserValitedManager;

public class Main {

	public static void main(String[] args) {
		UsersService service=new UserManager(new UsersDaoManager());
		GoogleAuthService authService=new AuthManager(service,new UserValitedManager(),new EmailValitedManager());
		authService.register(1, "Muhammet", "Ferat", "muhammetferat@gmail.com", "123456");
		authService.login("muhammetferat@gmail.com", "123456");

	}

}
