package entities;
import java.time.LocalDate;

public class Campaign {
	int id;
	String campaignName;
	double campaignDiscount;
	LocalDate startDate;
	LocalDate endDate;
	
	public Campaign(int id, String campaignName, double campaignDiscount, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getCampaignDiscount() {
		return campaignDiscount;
	}
	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

}
