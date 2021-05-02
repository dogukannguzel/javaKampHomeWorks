package Concrete;

import Entities.AdminUser;
import Entities.Campaign;
import Ýnterfaces.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin yeni bir kampanya oluþturdu : " + campaign.getCampaignName());
		
	}

	@Override
	public void removeCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin kampanyayý sildi : " + campaign.getCampaignName());
		
	}

	@Override
	public void uptadeCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin kampanyayý güncelledi : " + campaign.getCampaignName());
		
	}

}
