package javaHomeWork;

public class Main {

	public static void main(String[] args) {
	
		
		
		Instructor ýnstructor = new Instructor();
		
		ýnstructor.setId(1);
		ýnstructor.setFirstName("Engin");
		ýnstructor.setUserName("engindemirog");
		ýnstructor.setBio("Instructor");
		ýnstructor.setCourseId(0); // 
		ýnstructor.setMaýl("engin@gmail.com");
		ýnstructor.setPassword("1234");
		
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Dogukan");
		student1.setLastName("Güzel");
		student1.setCompletedRate(0);
		student1.setMyCourses("Kurs");
		student1.setUserName("dogukanguzel");
		student1.setMaýl("dgkngzl33 @gmail.com");
		
		
		
		
		
		//UserManager userManager = new UserManager();
		
		//userManager.add(student1);
		
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.registerCourse(student1,"courseName");
		studentManager.add(student1)
		
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.addCourse("React",instructor);
		instructorManager.addCourse("Java",instructor);
		
		
		
		
		
	}

}
