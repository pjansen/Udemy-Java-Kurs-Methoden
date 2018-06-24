
public class Methoden {

	public static void main(String[] args) {

		// <Modifikator Rückgabedatentyp Methodenname (Datentyp Parameter1, Datentyp Parameter2) >
		// Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public, private und protected
		
		ausgabe();
		summe();

	}
	
	public static void ausgabe() {
		System.out.println("Ich bin eine Methode");
	}

	public static void summe() {
		int a, b, summe;
		a = 5;
		b = 5;
		summe = a + b;
		System.out.println(summe);
	}
	
}
