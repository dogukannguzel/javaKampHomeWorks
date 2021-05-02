package ConsoleIU;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Do�ukan");
		customer.setLastName("G�zel");
		customer.setNationalityId("11111111111");
		customer.setDateOfBirth("1234/123/123");
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		
		
		
		
		baseCustomerManager.save(customer);
		
		
		
		
		

	}

}
