
/**
 * A program that gets user input and tells the user what they put matches a certain regex 
 * @author Rose Reiner
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class User_Match {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userInput;
		String regex = "quit";
		Pattern p = Pattern.compile(regex);
	

		while (true) {
			System.out.println("Enter a line of text. If you enter the word quit, the program will end.");
			System.out.println("Your line of text is: ");
			userInput = scan.nextLine();
			Matcher m = p.matcher(userInput);

			if(regexMatch ("quit", userInput)) {
				System.out.println("You entered quit");
				break;
			} 
			if(regexMatch("Skidmore", userInput)){
				System.out.println("Your text contains Skidmore");
			}
			if(regexMatch("(\\d\\d\\/\\d\\d\\/\\d\\d\\d\\d)", userInput)) {
				System.out.println("Your text contains a date in this format e.g. 10/14/1994");
			}
			if(regexMatch("[a-z]", userInput)) {
				System.out.println("Your text contains lowercase letters");
			}
			if(regexMatch("[A-Z]", userInput)){
				System.out.println("Your text contains uppercase letters");
			}
			if(regexMatch("^College", userInput)) {
				System.out.println("The first non whitespace characters is College");
			}
			if(regexMatch("\\.$", userInput)) {
				System.out.println("Your text ends with a period");
			}
		
		}
		System.out.println("Program ended.");
	}
	
	
	//Will tell whether the inputed string matches the regex
	public static boolean regexMatch(String regex, String input) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		
		if(m.find()) {
			return true;
		} 
		return false;
	}

}

