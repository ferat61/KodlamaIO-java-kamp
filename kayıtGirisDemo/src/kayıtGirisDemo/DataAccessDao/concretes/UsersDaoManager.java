package kay�tGirisDemo.DataAccessDao.concretes;

import java.util.ArrayList;
import java.util.List;

import kay�tGirisDemo.DataAccessDao.abstracts.UsersDao;
import kay�tGirisDemo.Entities.cocncretes.Users;

public class UsersDaoManager implements UsersDao {
	
	List<Users> user=new ArrayList<Users>();

	@Override
	public void add(Users users) {
		user.add(users);
		System.out.println("Kulan�c� eklendi : " + users.getFirstname());
		
	}

	@Override
	public void update(Users users) {
		Users users2= getByid(users.getId());
		users2.setFirstname(users.getFirstname());
		users2.setLastname(users.getLastname());
		users2.setPassword(users.getPassword());
		
		
	}

	@Override
	public void delete(Users users) {
		user.removeIf(u->u.getId()==users.getId());
	}

	@Override
	public Users getByid(int id) {
		for(Users users:user) {
			if(users.getId()==id) {
				return users;
			}
		}
		return null;
	}

	@Override
	public Users getByEposta(String eposta) {
		for(Users users:user) {
			if(users.getEposta()==eposta)
		{
				
				return users;
				}
			
		}
		return null;
	}

	@Override
	public List<Users> getAll() {
		
		return user;
	}

	@Override
	public Users getByEpostaAndPassword(String eposta,String password) {
		for(Users users:user) {
			if(users.getEposta()==eposta && users.getPassword()==password) {
				return users;
			}
		}
		return null;
	}

}
