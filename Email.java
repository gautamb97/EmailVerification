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
	// Ensuring "." and validating third part like .com 
	public void emailVerificationPartThree() {
		System.out.println("Enter your email id: ");
		String input = userInput.next();
		if(Pattern.matches("^[a-z]{3,}\\@[a-z]*\\.[a-z]*$", input)) 
			System.out.println("Valid");
		else {
			System.out.println("Invalid input re-enter email id: ");
			emailVerificationPartThree();
		}
	}
	//Using special character in between of email first part
	public void specialCharacterBetweenEmailFirstPart() {
		System.out.println("Enter your email id: ");
		String input = userInput.next();
		if(Pattern.matches("^[a-z\\+\\-\\_\\.a-z]{3,}\\@[a-z]*\\.[a-z]*$", input)) 
			System.out.println("Valid");
		else {
			System.out.println("Invalid input re-enter email id: ");
			specialCharacterBetweenEmailFirstPart();
		}
	}
	//Adding top level domains at the last of Email
	public void addingTopLevelDomainInEmail() {
		System.out.println("Enter your email id: ");
		String input = userInput.next();
		if(Pattern.matches("^[a-z\\+\\-\\_\\.a-z]{3,}\\@[a-z]*\\.[a-z]{1,3}\\.[a-z]{2}$", input)) 
			System.out.println("Valid");
		else {
			System.out.println("Invalid input re-enter email id: ");
			addingTopLevelDomainInEmail();
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome for Email Verification");
		Email validation = new Email();
		validation.emailVerificationPartOne();
		validation.emailVerificationPartTwo();
		validation.emailVerificationPartThree();
		validation.specialCharacterBetweenEmailFirstPart();
		validation.addingTopLevelDomainInEmail();
	}

}
