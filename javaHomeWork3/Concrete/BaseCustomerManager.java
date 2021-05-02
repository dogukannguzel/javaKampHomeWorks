package Concrete;

import Entities.Customer;
import �nterfaces.CustomerService;

public  class BaseCustomerManager implements CustomerService {

	@Override
	public void register(Customer customer) {
		System.out.println(customer.getFirstName() +  " adl� kullan�c� sisteme kay�t oldu");
		
	}

	@Override
	public void removeUser(Customer customer) {
		System.out.println(customer.getFirstName() +  " adl� kullan�c� sistemden kayd�n� sildi");
		
	}

	@Override
	public void uptadeUser(Customer customer) {
		System.out.println(customer.getFirstName() +  " adl� kullan�c� sistemden kayd�n� g�ncelledi");
		
	}

}
