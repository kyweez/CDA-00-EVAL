import java.util.Scanner;

public class BiggestSquare {

	public static void main(String[] args) {
		//VARIABLES DECLARATION
		Scanner sc;
		int number1;
		int number2;
		final int MAX_VALUE;
		final int MIN_VALUE;
		boolean errorTesting;
		
		//VARIABLES ASSIGNMENTS 
		sc = new Scanner(System.in);
		errorTesting = true;
		number1 = 0;
		number2 = 0;
		MAX_VALUE = (int)Math.sqrt(Integer.MAX_VALUE);
		MIN_VALUE = MAX_VALUE*(-1);
		
		//USER INPUTS
		//First input
		System.out.println("Veuillez saisir un nombre entier");
		while (errorTesting) {
			//Variable type testing
			if (sc.hasNextInt()) {
				//Scanner hack in case of a string input
				number1 = Integer.parseInt(sc.next()); 
				//Testing if the result isn't out of bounds of an integer (2147483647)
				if (Math.abs(number1) > Math.sqrt(Integer.MAX_VALUE)) {
					System.out.println("Veuillez saisir un nombre entre " + MIN_VALUE + " et " + MAX_VALUE);
				}
				else
					errorTesting = false;
			}
			else {
				System.out.println("Mauvaise saisie. Veuillez saisir un nombre entre " + MIN_VALUE + " et " + MAX_VALUE);
				sc.next();
			}
		}
		//Second input
		System.out.println("Veuillez saisir un second nombre entier");
		errorTesting = true;
		while (errorTesting) {
			//Variable type testing
			if (sc.hasNextInt()) {
				//Scanner hack in case of a string input
				number2 = Integer.parseInt(sc.next()); 
				//Testing if the result isn't out of bounds of an integer (2147483647)
				if (Math.abs(number2) > Math.sqrt(Integer.MAX_VALUE)) {
					System.out.println("Veuillez saisir un nombre entre " + MIN_VALUE + " et " + MAX_VALUE);
				}
				else
					errorTesting = false;
			}
			else {
				System.out.println("Mauvaise saisie. Veuillez saisir un nombre entre " + MIN_VALUE + " et " + MAX_VALUE);
				sc.next();
			}
		}
		
		//SACNNER CLOSING
		sc.close();
		
		//RESULT DISPLAY
		System.out.println("Le carré du plus grand des 2 nombres est : " 
							+ (number1>number2?number1*number1:number2*number2));
	}
}