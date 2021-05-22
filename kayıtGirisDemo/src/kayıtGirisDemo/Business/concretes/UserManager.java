package kayýtGirisDemo.Business.concretes;

import java.util.List;

import kayýtGirisDemo.Business.abstracts.UsersService;
import kayýtGirisDemo.DataAccessDao.abstracts.UsersDao;
import kayýtGirisDemo.Entities.cocncretes.Users;

public class UserManager implements UsersService {
	UsersDao usersdao;

	public UserManager(UsersDao usersdao) {
		super();
		this.usersdao = usersdao;
	}

	@Override
	public void add(Users users) {
		usersdao.add(users);
		System.out.println("Kullanýcý ekelndi");
		
	}

	@Override
	public void update(Users users) {
		usersdao.update(users);
		System.out.println("kullanýcý güncellendi");
		
	}

	@Override
	public void delete(Users users) {
		usersdao.delete(users);
		System.out.println("Kullanýcý silindi");
		
	}

	@Override
	public Users getByid(int id) {
		
		return usersdao.getByid(id);
	}

	@Override
	public Users getbyEposta(String eposta) {
		
		return usersdao.getByEposta(eposta);
	}

	@Override
	public Users getbyEpostaAndPassword(String eposta, String password) {
	
		return usersdao.getByEpostaAndPassword(eposta, password);
	}

	@Override
	public List<Users> getAll() {
		
		return usersdao.getAll();
	}

}
