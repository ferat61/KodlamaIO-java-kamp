
package concretes;

import abstracts.campaignService;
import entities.Campaign;

public class campaignManager implements campaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Güncellendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Silindi");
		
	}

}
