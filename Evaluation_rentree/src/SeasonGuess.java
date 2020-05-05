import java.util.Scanner;

public class SeasonGuess {

	public static void main(String[] args) {
		// Declaration des variables
		Scanner sc;
		byte monthNumber;

		// Instanciation du scanner
		sc = new Scanner(System.in);

		// Saisie utilisateur
		System.out.println("Veuillez saisir le numero d'un mois");
		monthNumber = sc.nextByte();

		//Algo de resolution
		if (monthNumber < 1 || monthNumber > 12)
			System.out.println("Mauvais numnero de mois");
		else if (monthNumber <= 6)
			System.out.println("La saison correspondante est : "  
								+ (monthNumber<=3?"Hiver":"Printemps"));
		else
			System.out.println("La saison correspondante est : "  
								+ (monthNumber<=9?"Ete":"Automne"));
		
		// Cloture du scanner
		sc.close();
	}
}