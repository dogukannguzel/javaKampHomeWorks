package javaHomeWork;

public class UserManager {

	
	public void add(User user) {
		
		System.out.println(user.getFirstName()+ " kayıt oldu.");
		
		
	}
	
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
		System.out.println("Kullanıcı sisteme kayıt edildi !!");
		System.out.println(user.getFirstName());
		
		
		}
		
		
		
	}
	
	
	public void uptadeFirstName(String name) {
		
		System.out.println("İsminiz başarıyla güncellendi");
		
		
	}
	
	
	public void uptadeUserName(String userName) {
		
		System.out.println("Kullanıcı adınız başarıyla güncellendi");
		
		
	}
	
	public void changePassword(String newPassword) {
		
		System.out.println("Parolabaşarıyla güncellendi");
		
		
	}
	
	
	// Değiştirebileceğimiz bilgilere göre methodları artırabiliriz.
	
	
	
	
}
