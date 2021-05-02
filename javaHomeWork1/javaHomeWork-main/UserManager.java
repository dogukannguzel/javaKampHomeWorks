package javaHomeWork;

public class UserManager {

	
	public void add(User user) {
		
		System.out.println(user.getFirstName()+ " kayýt oldu.");
		
		
	}
	
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
		System.out.println("Kullanýcý sisteme kayýt edildi !!");
		System.out.println(user.getFirstName());
		
		
		}
		
		
		
	}
	
	
	public void uptadeFirstName(String name) {
		
		System.out.println("Ýsminiz baþarýyla güncellendi");
		
		
	}
	
	
	public void uptadeUserName(String userName) {
		
		System.out.println("Kullanýcý adýnýz baþarýyla güncellendi");
		
		
	}
	
	public void changePassword(String newPassword) {
		
		System.out.println("Parolabaþarýyla güncellendi");
		
		
	}
	
	
	// Deðiþtirebileceðimiz bilgilere göre methodlarý artýrabiliriz.
	
	
	
	
}
