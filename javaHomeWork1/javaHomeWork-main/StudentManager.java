package javaHomeWork;

public class StudentManager extends UserManager {
	
	public void registerCourse(User user,String courseName) {
		
		System.out.println(user.getFirstName()+" adlı kullanıcı " + courseName + " kursuna kayıt oldu !");
		
	}
	
	
	
	
}
