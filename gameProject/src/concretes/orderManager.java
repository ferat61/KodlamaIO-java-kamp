package concretes;

import abstracts.orderService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class orderManager implements orderService {

	@Override
	public void order(Gamer gamer, Game game, Campaign campaign) {
		double price=game.getPrice()-game.getPrice()*(campaign.getCampaignDiscount()/100);
		System.out.println(gamer.getFirstname()+" "+gamer.getLastname()+" "+game.getGameName()+" oyununu ba�ar�l� �ekilde sat�n ald�n�z.\n"
				
				+"�ndrimli fiyat : "+price+"TL\n"+
				"Uygulanan kampanya indirimi %"+campaign.getCampaignDiscount());
		
	}

}
