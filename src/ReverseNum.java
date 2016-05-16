/*Jonathan Abdo
This class will ask the user for a number, and 
then print the reverse to the console.
*/

import java.util.Scanner;

public class ReverseNum {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;

		System.out.print("Please enter a number: ");
		num = input.nextInt();
		System.out.println("Your number is "+num);
	}
}
