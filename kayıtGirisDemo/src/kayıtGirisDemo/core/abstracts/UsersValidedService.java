package kay�tGirisDemo.core.abstracts;

import kay�tGirisDemo.Entities.cocncretes.Users;

public interface UsersValidedService {
	Boolean registerValited(Users users);
	Boolean loginValited(String eposta,String password);

}
