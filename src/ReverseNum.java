/*Jonathan Abdo
This class will ask the user for a number, and 
then print the reverse to the console.
*/

import java.util.Scanner;

public class ReverseNum {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double num = 0;
		
		System.out.print("Please enter a number: ");
		if (input.hasNextDouble()) {
			num = input.nextDouble();
		}
		else {
			System.out.println("That wasn't a number, please try again.");
		}
		
	}
}
