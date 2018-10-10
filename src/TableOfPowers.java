import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int i;
		String contYN;
		System.out.println("Welcome to the Table of Powers.");
		System.out.println("We will be printing a table of squares and cubes.");

		//this do while loop will eventually prompt the user at the end 
		//to rerun the program if they choose to. 
		do {
			System.out.println("Please enter an interger");
			
			//scans for the users chosen number
			number = input.nextInt();
			//This is the set up the grid for the answer
			// the %-10s will space out the answers evenly
			System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s\n", "======", "======", "======");
			
			
			//for loop to run the conditons for the grid
			for (i = 1; i <= number; i++) {
				
				//math for a square
				int square = (int) Math.pow(i, 2);
				
				//math for a cube
				int cubed = (int) Math.pow(i, 3);
				
				//prints out the results in the same format
				System.out.printf("%-10s %-10s %-10s\n", i, square, cubed);

			}
			
			System.out.println("Would you like to continue? Press Y to start again, or N to stop.");
			contYN = input.next();

		} while (contYN.equalsIgnoreCase("y")); //if they press y the program restarts
		//close scanner
		input.close();

		System.out.println("Have a nice day.");

	}

}
