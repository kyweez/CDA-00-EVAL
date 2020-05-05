import java.util.Scanner;

public class BiggerSquare {

	public static void main(String[] args) {
		//Declaration des variables 
		Scanner sc;
		int number1;
		int number2;
		
		//Instanciation du scanner
		sc = new Scanner(System.in);
		
		//Saisie utilisateur
		System.out.println("Veuillez saisir un nombre entier");
		number1 = sc.nextInt();
		System.out.println("Veuillez saisir un second entier");
		number2 = sc.nextInt();
		
		//Cloture du scanner
		sc.close();
		
		//Affichage du resultat
		System.out.println("Le carré du plus grand des 2 nombres est : " + (number1>number2?number1*number1:number2*number2));
	}
}