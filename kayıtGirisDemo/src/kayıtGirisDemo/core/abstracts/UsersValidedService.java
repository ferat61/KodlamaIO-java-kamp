package kayýtGirisDemo.core.abstracts;

import kayýtGirisDemo.Entities.cocncretes.Users;

public interface UsersValidedService {
	Boolean registerValited(Users users);
	Boolean loginValited(String eposta,String password);

}
