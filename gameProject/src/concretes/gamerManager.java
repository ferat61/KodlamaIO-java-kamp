package concretes;

import abstracts.gamerCheckService;
import abstracts.gamerSercive;
import entities.Gamer;

public class gamerManager implements gamerSercive {
	private gamerCheckService checkService;
	Boolean Login=false;

	public gamerManager(gamerCheckService checkService) {
		this.checkService=checkService;
		
	}
	@Override
	public void add(Gamer gamer) {
		if(checkService.validate(gamer)) {
			System.out.println(gamer.getFirstname() + " Tebrikler Ba�ar�l� kay�t olu�turuldu.");
			Login=true;
		}else {
			System.out.println("\nGe�ersiz kimlik giri�i Kay�t ba�ar�s�z.");
			 Login=false;
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

}
