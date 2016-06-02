/*Jonathan Abdo
This class will ask the user for a number, and 
then print the reverse to the console.
*/

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {

		long num = 0, rev = 0;
		
		//Use a try/catch block to prevent non-numerical inputs
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a number: ");
			num = input.nextLong();
			//reverse number given by user via % and /
			while (num > 0) {
				rev = rev * 10;
				rev = rev + num % 10;
				num = num / 10;
			}
			//Print the result and run again
			System.out.println("The reverse of your number is " + rev);
			main(args);
		} catch (Exception e) {//catch any incompatible inputs
			System.out.println("That wasn't a number or it was too long, please try again.");
			main(args);
		}
	}
}
