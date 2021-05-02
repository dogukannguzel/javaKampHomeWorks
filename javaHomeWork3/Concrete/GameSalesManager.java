package Concrete;

import Entities.Customer;
import Ýnterfaces.GameSalerService;

public class GameSalesManager implements GameSalerService {

	@Override
	public void buyGame(Customer customer) {
		System.out.println(customer.getFirstName() + " satýn alma iþlemi baþarýlý");
		
	}

	@Override
	public void removeToCart(Customer customer) {
		System.out.println(customer.getFirstName() + " sepetten item silindi");
		
	}

	@Override
	public void uptadeToCart(Customer customer) {
		System.out.println(customer.getFirstName() + " sepet güncellendi");
		
	}
	
}
