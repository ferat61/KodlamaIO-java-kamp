package kayýtGirisDemo.DataAccessDao.abstracts;

import java.util.List;

import kayýtGirisDemo.Entities.cocncretes.Users;

public interface UsersDao {
	void add(Users users);
	void update(Users users);
	void delete(Users users);
	Users getByid(int id);
	Users getByEposta(String eposta);
	List<Users> getAll();
	Users getByEpostaAndPassword(String eposta,String password);

}
