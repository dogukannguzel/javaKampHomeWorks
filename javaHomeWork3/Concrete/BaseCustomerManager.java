package Concrete;

import Entities.Customer;
import Ýnterfaces.CustomerService;

public  class BaseCustomerManager implements CustomerService {

	@Override
	public void register(Customer customer) {
		System.out.println(customer.getFirstName() +  " adlý kullanýcý sisteme kayýt oldu");
		
	}

	@Override
	public void removeUser(Customer customer) {
		System.out.println(customer.getFirstName() +  " adlý kullanýcý sistemden kaydýný sildi");
		
	}

	@Override
	public void uptadeUser(Customer customer) {
		System.out.println(customer.getFirstName() +  " adlý kullanýcý sistemden kaydýný güncelledi");
		
	}

}
