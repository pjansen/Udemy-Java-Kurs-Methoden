
public class BeispielMethoden {

	public static void main(String[] args) {
		
		int lebenGegner = 100;
		System.out.println("Der Boss hat: " + lebenGegner);

		lebenGegner = gegnerHit(lebenGegner);
		System.out.println("Bott getroffen hat noch " + lebenGegner + " Lebenspunkte");

		lebenGegner = gegnerHit(lebenGegner);
		System.out.println("Bott getroffen hat noch " + lebenGegner + " Lebenspunkte");

		lebenGegner = gegnerHit(lebenGegner);
		System.out.println("Bott getroffen hat noch " + lebenGegner + " Lebenspunkte");

	}

	public static int gegnerHit(int aktuellLeben) {

		int neuGegnerLeben;
		
		neuGegnerLeben = aktuellLeben - 20;
		
		return neuGegnerLeben;
		
	}
	
}
