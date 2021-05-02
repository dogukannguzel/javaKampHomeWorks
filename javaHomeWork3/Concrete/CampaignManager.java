package Concrete;

import Entities.AdminUser;
import Entities.Campaign;
import İnterfaces.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin yeni bir kampanya oluşturdu : " + campaign.getCampaignName());
		
	}

	@Override
	public void removeCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin kampanyayı sildi : " + campaign.getCampaignName());
		
	}

	@Override
	public void uptadeCampaign(Campaign campaign,AdminUser adminUser) {
		System.out.println(adminUser.getFisrtName() + " admin kampanyayı güncelledi : " + campaign.getCampaignName());
		
	}

}
