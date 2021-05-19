package concretes;

import abstracts.gameService;
import entities.Game;

public class gameManager implements gameService {
	
	

	@Override
	public void add(Game game) {
		
		System.out.println(game.getGameName()+" Eklendi");
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getGameName()+" Güncellendi");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" Silindi");
		
	}
	

}

