package Concrete;

import Abstract.CustomerCheckService;

import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkOfRealPerson(Customer customer) {
		
		
		return true;

	}

}
