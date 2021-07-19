package workshop;
import java.util.Scanner;
public class Uc2 {
	public static char getInputFromUser() {
		System.out.println("Enter the input");
		String input= Utility.getString();
		System.out.println("User input :: "+input);
			if(input.equals("X")) {
				System.out.println("Computer input :: O");
			}else {
				System.out.println("Computer input :: X");
			}
		return input.charAt(0);
	}
	
	public static char getImputForComputer(char input) {
		if(input == 'X') {
			return 'O';
		}else {
			return 'X';
		}
	}
}
