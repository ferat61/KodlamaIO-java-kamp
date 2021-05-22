package kay�tGirisDemo.Business.abstracts;

import java.util.List;

import kay�tGirisDemo.Entities.cocncretes.Users;

public interface UsersService {
	void add(Users users);
	void update(Users users);
	void delete(Users users);
	Users getByid(int id);
	Users getbyEposta(String eposta);
	Users getbyEpostaAndPassword(String eposta,String password);
	List<Users> getAll();

}
