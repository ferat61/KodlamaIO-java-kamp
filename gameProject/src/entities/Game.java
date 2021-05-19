package entities;

public class Game {
	private int id;
	private String gameName;
	private String category;
	private double price;
	private String stockAmount;
	
	public Game(int id, String gameName, String category, double price, String stockAmount) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.category = category;
		this.price = price;
		this.stockAmount = stockAmount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(String stockAmount) {
		this.stockAmount = stockAmount;
	}

}
