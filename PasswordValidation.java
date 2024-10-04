
public class PasswordValidation {

	/*
	 * 
	 * Secure Password requirements

			Password must contain at least one digit [0-9].
			Password must contain at least one lowercase Latin character [a-z].
			Password must contain at least one uppercase Latin character [A-Z].
			Password must contain at least one special character like ! @ # & ( ).
			Password must contain a length of at least 8 characters and a maximum of 20 characters.
	 */
	
	public static void main(String[] args) {
		
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,20}$";
		
		String password = "Helloworld$123";
		if(password.matches(regex))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		
	}
}
