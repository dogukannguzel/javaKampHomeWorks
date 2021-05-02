package Concrete;

import Entities.Customer;
import Ýnterfaces.CustomerCheckService;
import Ýnterfaces.Loggers;

public class CustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	private Loggers logger ;
	
	
	
	public CustomerManager(CustomerCheckService customerCheckService,Loggers logger) {

		this.customerCheckService = customerCheckService;
		this.logger = logger;
	}

	@Override
	public void register(Customer customer) {
		if (customerCheckService.userController(customer)) {
			
			logger.log(customer.getFirstName() +  " sisteme kayýt oldu");
			
			super.register(customer);
		}
		
		else {
			System.out.println("cannot to register user");
			
		}

	}

}
