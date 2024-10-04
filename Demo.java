
public class Demo {

	public static void main(String[] args) {
		
		String regex = "^(\\+[1-9]{2}-[6-9]{1}[0-9]{9})$";
		String mnumber="+91-9822291613";
		if(mnumber.matches(regex))
			System.out.println("Matches");
		else
			System.out.println("No");
		
		//must be alphanumeric and contains 5-12 chars
		String usernameRegex = "^[a-zA-Z0-9]{5-12}$";
		
		// Password must alphanumeric ( @,_,- allowed) 8-20
		String passRegex = "^[a-zA-Z0-9@_-]{8-20}$";
		// or [\w@-]
		
		//username - any letters,numbers,dots and/or -
		//domain - any letters,numbers and/or -
		
		String email = "^[\\w.-]+@([a-zA-Z0-9]+)\\.[a-zA-Z0-9]{2,5}$";
		if("amolpatil2012@gm*ail.com".matches(email))
			System.out.println("Ok");
		
		
		// ?=regex is a positive lookahead
		
		//String passwordValidation="^(?=[a-z])$"
		
		
		String s = "s1234";
		s.matches("[a-z]1234");
		
		String p = "123s4";
		System.out.println(p.substring(2,4));
	}
}
