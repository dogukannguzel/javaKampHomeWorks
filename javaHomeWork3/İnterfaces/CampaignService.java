package Ýnterfaces;

import Entities.AdminUser;
import Entities.Campaign;

public interface CampaignService {
	void addCampaign(Campaign campaign,AdminUser adminUser);
	void removeCampaign(Campaign campaign,AdminUser adminUser);
	void uptadeCampaign(Campaign campaign,AdminUser adminUser);
	
}
