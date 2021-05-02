package ConsoleUI;



import Concrete.CampaignManager;
import Concrete.CustomerCheckManager;
import Concrete.CustomerManager;
import Concrete.GameSalesManager;
import Entities.AdminUser;
import Entities.Campaign;
import Entities.Customer;
import LogSaves.DatabaseLogger;

public class Main {

	
	public static void main(String[] args) {

		Customer customer = new Customer(1, "Birkan", "G�zel", "birkanguzel@gmail.com", "111111111",
				"2001/12/12");
		AdminUser adminUser = new AdminUser(1, "Do�ukan", "G�zel");
		Campaign campaign = new Campaign(1, "G�ld�ren kampanya", "Sava� oyunlar�nda %15 indirim");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign, adminUser);
		

		//new MernisServiceAdapter() ; mernis do�rulamas�da eklendi !
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(), new DatabaseLogger());
													
		customerManager.register(customer);
		customerManager.removeUser(customer);
		customerManager.uptadeUser(customer);
		
		
		
		GameSalesManager gameSalesManager = new GameSalesManager();
		
		gameSalesManager.buyGame(customer);
		
		
	}

}
