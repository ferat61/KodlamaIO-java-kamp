package kodlamaioOdev3;

public class userManager {
	public void add(User users) {
		System.out.println("Kulllanýcý : " +users.getUserName());
		System.out.println("Þifre : " +users.getPassword());
		System.out.println("Email : " +users.getEmail());
	}
	public void addMultiple(User[]users) {
		
		
		for(User user:users) {
			
			add(user);
		}
		
	}

}
