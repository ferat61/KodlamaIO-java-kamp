package kodlamaioOdev3;

public class userManager {
	public void add(User users) {
		System.out.println("Kulllan�c� : " +users.getUserName());
		System.out.println("�ifre : " +users.getPassword());
		System.out.println("Email : " +users.getEmail());
	}
	public void addMultiple(User[]users) {
		
		
		for(User user:users) {
			
			add(user);
		}
		
	}

}
