package javaHomeWork;

public class UserManager {

	
	public void add(User user) {
		
		System.out.println(user.getFirstName()+ " kay�t oldu.");
		
		
	}
	
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
		System.out.println("Kullan�c� sisteme kay�t edildi !!");
		System.out.println(user.getFirstName());
		
		
		}
		
		
		
	}
	
	
	public void uptadeFirstName(String name) {
		
		System.out.println("�sminiz ba�ar�yla g�ncellendi");
		
		
	}
	
	
	public void uptadeUserName(String userName) {
		
		System.out.println("Kullan�c� ad�n�z ba�ar�yla g�ncellendi");
		
		
	}
	
	public void changePassword(String newPassword) {
		
		System.out.println("Parolaba�ar�yla g�ncellendi");
		
		
	}
	
	
	// De�i�tirebilece�imiz bilgilere g�re methodlar� art�rabiliriz.
	
	
	
	
}
