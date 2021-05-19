package abstracts;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface orderService {
	void order(Gamer gamer,Game game,Campaign campaign);

}
