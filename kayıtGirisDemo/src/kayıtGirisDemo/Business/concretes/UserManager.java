package kay�tGirisDemo.Business.concretes;

import java.util.List;

import kay�tGirisDemo.Business.abstracts.UsersService;
import kay�tGirisDemo.DataAccessDao.abstracts.UsersDao;
import kay�tGirisDemo.Entities.cocncretes.Users;

public class UserManager implements UsersService {
	UsersDao usersdao;

	public UserManager(UsersDao usersdao) {
		super();
		this.usersdao = usersdao;
	}

	@Override
	public void add(Users users) {
		usersdao.add(users);
		System.out.println("Kullan�c� ekelndi");
		
	}

	@Override
	public void update(Users users) {
		usersdao.update(users);
		System.out.println("kullan�c� g�ncellendi");
		
	}

	@Override
	public void delete(Users users) {
		usersdao.delete(users);
		System.out.println("Kullan�c� silindi");
		
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
