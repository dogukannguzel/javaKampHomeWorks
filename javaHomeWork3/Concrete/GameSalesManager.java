package Concrete;

import Entities.Customer;
import �nterfaces.GameSalerService;

public class GameSalesManager implements GameSalerService {

	@Override
	public void buyGame(Customer customer) {
		System.out.println(customer.getFirstName() + " sat�n alma i�lemi ba�ar�l�");
		
	}

	@Override
	public void removeToCart(Customer customer) {
		System.out.println(customer.getFirstName() + " sepetten item silindi");
		
	}

	@Override
	public void uptadeToCart(Customer customer) {
		System.out.println(customer.getFirstName() + " sepet g�ncellendi");
		
	}
	
}
