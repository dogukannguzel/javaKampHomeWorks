package Entities;

import ›nterfaces.Entity;

public class Campaign implements Entity{
	private int campaign›d;
	private String campaignName;
	private String campaignDetails;
	
	public Campaign() {}
	
	
	public Campaign(int campaign›d, String campaignName, String campaignDetails) {
		super();
		this.campaign›d = campaign›d;
		this.campaignName = campaignName;
		this.campaignDetails = campaignDetails;
	}
	public int getCampaign›d() {
		return campaign›d;
	}
	public void setCampaign›d(int campaign›d) {
		this.campaign›d = campaign›d;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignDetails() {
		return campaignDetails;
	}
	public void setCampaignDetails(String campaignDetails) {
		this.campaignDetails = campaignDetails;
	}
}
