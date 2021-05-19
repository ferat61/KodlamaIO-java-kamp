package gameProject;

import java.time.LocalDate;


import adapters.merniceServiceAdapters;
import concretes.campaignManager;
import concretes.gameManager;
import concretes.gamerManager;
import concretes.orderManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer=new Gamer(1, "Muhammet", "Ferat", "muhammet@gmail.com", 1999, Long.parseLong("895412647"));
		Game game=new Game(2, "Uçak savaþý", "Aksiyon", 250, "5");
		Campaign campaign=new Campaign(1, "Yýl sonu kampanyasý", 20, LocalDate.of(2020, 10, 01),LocalDate.of(2021, 01, 01) );
		
	     gamerManager gamerManagers=new gamerManager(new merniceServiceAdapters());
	     gamerManagers.add(gamer);
	     
	     gameManager gameManager=new gameManager();
	     gameManager.add(game);
	     
	     campaignManager campaignManager=new campaignManager();
	     campaignManager.add(campaign);
	     
	     orderManager orderManager=new orderManager();
	     orderManager.order(gamer, game, campaign);
		
		
	}

}
