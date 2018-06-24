
public class AufgabeMethoden {

	public static void main(String[] args) {
		
		/*
		 * Aufgabe:
		 * 
		 * 1. Wert: 3.547
		 * 2. Wert: 6.354
		 * 
		 * Definiere eine MEthode die als Aufgabe hat, diese zwei Werte zu multiplizieren
		 * Diese Werte sollen dabei als Parameter an die Methode übergeben werden
		 * 
		 * Der Wert der errechnet wird, soll dabei zurückgegeben werden, sodass wir den Wert in der Konsole ausgeben können.
		 */

		System.out.println(multipliziere(3.547, 6.354));
		
	}

	public static double multipliziere(double zahl1, double zahl2) {
		return zahl1 * zahl2;
	}
	
}
