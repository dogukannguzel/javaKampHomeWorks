package Concrete;

import Entities.AdminUser;
import Entities.Campaign;
import �nterfaces.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin yeni bir kampanya olu�turdu : " + campaign.getCampaignName());
		
	}

	@Override
	public void removeCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin kampanyay� sildi : " + campaign.getCampaignName());
		
	}

	@Override
	public void uptadeCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin kampanyay� g�ncelledi : " + campaign.getCampaignName());
		
	}

}
