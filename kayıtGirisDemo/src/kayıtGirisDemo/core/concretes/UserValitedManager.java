package kayýtGirisDemo.core.concretes;

import java.util.regex.Pattern;

import kayýtGirisDemo.Entities.cocncretes.Users;
import kayýtGirisDemo.core.abstracts.UsersValidedService;

public class UserValitedManager implements UsersValidedService {
	public UserValitedManager() {
		
	}
	public static final Pattern VALID_EMAÝL_ADRESS_REGEX=Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	@Override
	public Boolean registerValited(Users users) {
		Boolean result=checkIfFirstnameIsValid(users.getFirstname())&& checkIfLastNameIsValited(users.getLastname())&&checkIfEpostaIsValid(users.getEposta())&&checkIfFieldsEntered(users);
		return result;
		
	}

	private boolean checkIfEpostaIsValid(String eposta) {
	
		return VALID_EMAÝL_ADRESS_REGEX.matcher(eposta).find();
	}

	public Boolean checkIfFieldsEntered(Users users) {
		if(users.getFirstname().length()<=0||users.getLastname().length()<=0||users.getPassword().length()<=0||users.getEposta().length()<=0) {
			
			return false;
		}
		return true;
	}
		
		

	private boolean checkIfLastNameIsValited(String lastname) {
	if(lastname.length()>2) {
		return true;
	}
		return false;
	}

	private boolean checkIfFirstnameIsValid(String firstname) {
		if(firstname.length()>2) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean loginValited(String eposta, String password) {
		boolean result=checkIfEpostaIsValid(eposta)&&checkIfPassword(password);
		return result;
		
	}

	private boolean checkIfPassword(String password) {
		if(password.length()>6) {
			return true;
		}
		return false;
	}

}
