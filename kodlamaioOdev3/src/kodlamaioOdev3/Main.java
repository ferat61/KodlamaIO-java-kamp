package kodlamaioOdev3;

public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		student.setUserName("muhammet");
		student.setPassword("123456");
		student.setEmail("muhammetferat@gmail.com");
		student.setRegisteredCourse("Java");
		
		instructor instructor1=new instructor();
		instructor1.setUserName("Engin");
		instructor1.setPassword("123457541");
		instructor1.setEmail("engindemiroğ123@gmail.com");
		instructor1.setAllCourses("java,c#,phyton");
		
		userManager userManager1=new userManager();
		
		instructorManager manager=new instructorManager();
		
		studentManager manager2=new studentManager();
		
		userManager1.add(student);
		
		
		
		

	}

}
