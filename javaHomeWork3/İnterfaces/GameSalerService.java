package Ýnterfaces;


import Entities.Customer;

public interface GameSalerService {
	
	void buyGame(Customer customer);
	void removeToCart(Customer customer);
	void uptadeToCart(Customer customer);
	
}
