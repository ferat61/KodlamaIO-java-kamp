package concretes;

import abstracts.gamerCheckService;
import entities.Gamer;

public class gamerValidation implements gamerCheckService {

	@Override
	public Boolean validate(Gamer gamer) {
		if(gamer.getFirstname().length()>0 && gamer.getLastname().length()>0 && gamer.getEmail().length()>0 
				&& gamer.getBirthyear()>0 && gamer.getIdentitiynumber()>0 )
		{
			return true;
		}else {
			return false;
		}
		
	}

}
