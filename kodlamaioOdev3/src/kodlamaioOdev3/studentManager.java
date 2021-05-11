package kodlamaioOdev3;

public class studentManager extends userManager {
	public void add(Student student) {
		System.out.println("Kayıtlı kurs : " +""+student.getRegisteredCourse() );
	}
	public void addStudent(User user) {
		System.out.println(user.getUserName()+""+user.getPassword()+""+user.getEmail());
		
	}
	public void addMultiple(Student[]users) {
		for(Student students : users) {
			
			add(students);
		}
	}

}
