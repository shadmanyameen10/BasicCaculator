import java.util.Scanner;

public class BasicCalculator { // beginning of class "MyCalculator"

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) { // beginning of main method 

		menu(); // menu method

	} // end of main method

//===============================================================================================

//========================== CREATING NEW "MENU" METHOD FOR USER INTERFACE ======================

	public static void menu() { // beginning and creation of menu method
		boolean noExit = true;

//===============================================================================================

//================================ MODE LOGIC ===================================================

		do { // beginning of do-while loop

			System.out.println("Enter the calculator mode: Standard/Scientific?");
			String mode = input.next();

			while (!mode.equalsIgnoreCase("Standard") && !mode.equalsIgnoreCase("Scientific")) 
			
			{ // beginning of while loop
																									
				System.out.println(mode + " is an invalid mode");
				System.out.println("Please enter the correct calculator mode: Standard/Scientific?");
				mode = input.next();
			
			} // end of while loop

//================================================================================================

//=========================== CODE FOR STANDARD CALCULATOR =======================================

			if (mode.equalsIgnoreCase("Standard")) {// beginning of first if statement for standard calculator
				System.out.println("The calculator will operate in standard mode.");
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division: ");
				String operation = input.next();

				while (!operation.equalsIgnoreCase("+") && !operation.equalsIgnoreCase("-")
						&& !operation.equalsIgnoreCase("*") && !operation.equalsIgnoreCase("/"))

				{ // beginning of while loop

					System.out.println(operation + " is an invalid operator");
					System.out.println(
							"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division: ");
					operation = input.next();

				} // end of while loop

				switch (operation) { // beginning of switch statement
				case "+": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Enter another number: ");
					double num2 = input.nextDouble();
					System.out.println("Result: " + sum(num1, num2));
					break;
				} // end of case
				case "*": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Enter another number: ");
					double num2 = input.nextDouble();
					System.out.println("Result: " + product(num1, num2));
					break;
				} // end of case
				case "-": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Enter another number: ");
					double num2 = input.nextDouble();
					System.out.println("Result: " + difference(num1, num2));
					break;
				} // end case
				case "/": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Enter another number: ");
					double num2 = input.nextDouble();
					System.out.println("Result: " + quotient(num1, num2));
					break;
				} // end of case

				} // end of switch statement

			} // end of first if statement for scientific calculator 

//===============================================================================================

//=========================CODE FOR SCIENTIFIC CALCULATOR========================================

			 if (mode.equalsIgnoreCase("Scientific")) { // beginning of second if statement for scientific calculator 
				System.out.println("The calculator will operate in scientific mode.");
				System.out.println(
						"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, and 'tan' for tan x: ");
				String operation = input.next();

				while (!operation.equalsIgnoreCase("+") && !operation.equalsIgnoreCase("-")
						&& !operation.equalsIgnoreCase("*") && !operation.equalsIgnoreCase("/")
						&& !operation.equalsIgnoreCase("sin") && !operation.equalsIgnoreCase("cos")
						&& !operation.equalsIgnoreCase("tan"))

				{ // beginning of while loop
					
					System.out.println(operation + " is an invalid operator");
					System.out.println(
							"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, and 'tan' for tan x: ");
					operation = input.next();

				} // end of while loop

				switch (operation) { // beginning of switch statement
				case "+": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Enter another number: ");
					double num2 = input.nextDouble();

					System.out.println("Result: " + sum(num1, num2));
					break;
				} // end case
				case "*": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Enter another number: ");
					double num2 = input.nextDouble();
					System.out.println("Result: " + product(num1, num2));
					break;
				} // end of case
				case "-": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Enter another number: ");
					double num2 = input.nextDouble();
					System.out.println("Result: " + difference(num1, num2));
					break;
				} // end of case
				case "/": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Enter another number: ");
					double num2 = input.nextDouble();
					System.out.println("Result: " + quotient(num1, num2));
					break;
				} // end of case
				case "sin": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Result: " + sin(num1));
					break;
				} // end of case
				case "cos": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Result: " + cos(num1));
					break;
				} // end of case
				case "tan": { // beginning of case
					System.out.println("Enter a number: ");
					double num1 = input.nextDouble();
					System.out.println("Result: " + tan(num1));
					break;
				} // end of case

				} // end of switch statement

			} // end of second if statement for scientific calculator 

//=======================================================================================================

//==================================== END/GOODBYE LOGIC ================================================

			System.out.println("Do you want to start over? (Y/N)");
			String answer = input.next();

			while (!answer.equalsIgnoreCase("N") && !answer.equalsIgnoreCase("Y")) 
			
			{ // beginning of while loop

				System.out.println(answer + " is an invalid answer");
				System.out.println("Do you want to start over? (Y/N)");
				answer = input.next();

			} // end of while loop

			if (answer.equalsIgnoreCase("N")) { // beginning of if statement

				noExit = false;
				System.out.println("Goodbye");

			} // end of if statement

		} while (noExit); // end of do-while loop

	} // end of menu method

//====================================================================================================

//====================================RETURN METHODS==================================================    

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

	public static double product(double num1, double num2) {
		return num1 * num2;
	}

	public static double difference(double num1, double num2) {
		return num1 - num2;
	}

	public static double quotient(double num1, double num2) {
		return num1 / num2;
	}

	public static double sin(double num1) {
		return Math.sin(num1);
	}

	public static double cos(double num1) {
		return Math.cos(num1);
	}

	public static double tan(double num1) {
		return Math.tan(num1);
	}

} // end of class "MyCalculator"