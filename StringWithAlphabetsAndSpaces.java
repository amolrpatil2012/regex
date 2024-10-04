import java.util.Scanner;

public class StringWithAlphabetsAndSpaces {

	// check if string contains only alphabets and spaces
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any String");
		String s = scanner.nextLine();
		if(s.matches("^[a-zA-Z\\s]*$"))
				System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
	
}
