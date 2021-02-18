import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {
	static Scanner userInput = new Scanner(System.in);
	public void emailVerificationPartOne() {
		System.out.println("Enter your email id: ");
		String input = userInput.next();
		if(Pattern.matches("^[a-z]{3,}$", input)) 
			System.out.println("Valid");
		else {
			System.out.println("Invalid input re-enter email id: ");
			emailVerificationPartOne();
		}
	}
	//ensuring @ and validating part two
	public void emailVerificationPartTwo() {
		System.out.println("Enter your email id: ");
		String input = userInput.next();
		if(Pattern.matches("^[a-z]{3,}\\@[a-z]*$", input)) 
			System.out.println("Valid");
		else {
			System.out.println("Invalid input re-enter email id: ");
			emailVerificationPartTwo();
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome for Email Verification");
		Email validation = new Email();
		validation.emailVerificationPartOne();
		validation.emailVerificationPartTwo();
	}

}
