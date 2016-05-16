/*Jonathan Abdo
This class will ask the user for a number, and 
then print the reverse to the console.
*/

import java.util.Scanner;

public class ReverseNum {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0, rev = 0;

		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a number: ");
			num = input.nextInt();
			while (num > 0) {
				rev = rev * 10;
				rev = rev + num % 10;
				num = num / 10;
			}
			System.out.println("The reverse of your number is " + rev);
			main(args);
		} catch (Exception e) {
			System.out.println("That wasn't a number, please try again.");
			main(args);
		}
	}
}
