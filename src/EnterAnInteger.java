import java.util.Scanner;

public class EnterAnInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInteger;
		//char userChar = 'y';

		System.out.println("Please enter your first name.");
		String userName = scan.next();

		System.out.println("Please enter an integer between 1 and 100:");

		userInteger = scan.nextInt();
		//do {
			
		
		if (userInteger < 1 || userInteger > 100) {
			System.out.println("Invalid entry, " + userName + "." + "  " + "Your entry needs to be an integer between 1 and 100..." + 
		userInteger + " " + "does not satisfy the criteria.");
			
		} else if ((userInteger % 2 != 0) && (userInteger >= 60) && (userInteger <= 100)) {
			System.out.println(userName + ","  + userInteger + " is odd and over 60.");

		} else if ((userInteger % 2 == 0) && (userInteger >= 2) && (userInteger <= 25)) {
			System.out.println(userName + "," + "this is even and less than 25.");
			
		} else if ((userInteger % 2 == 0) && (userInteger >= 60) && (userInteger <= 100)) {
			System.out.println(userName + " "  + userInteger + " is even.");
		
		} else if ((userInteger % 2 != 0) && (userInteger >= 60) && (userInteger <= 100)) {
			System.out.println(userName + " " + userInteger + " is odd and over 60.");

		} else if (userInteger % 2 != 0) 
			System.out.println(userName + ",  " + userInteger + " is odd.");
			
			/*System.out.println();
			scan.nextLine();
			System.out.println("Continue (y/n): ");

			userChar = scan.next().charAt(0);
			userChar = Character.toLowerCase(userChar);


			} while (userChar == 'y') { 
			
			System.out.println("Goodbye!"); */
			
			scan.close();
		
	}
		}