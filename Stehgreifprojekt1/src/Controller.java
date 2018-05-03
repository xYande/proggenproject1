
public class Controller {

	public static void main (String [] args) {
		
		String action [];
		String line;
		
		System.out.println("Willkommen bei BuildYourBurger!");
		System.out.println("Bitte geben Sie Ihre Bestellung für Ihre Lieblingsburger ein.");
		System.out.println("Mit „menu“ können Sie sich die vollständigen Zutaten anzeigen lassen.");
		System.out.println("Mit „zutat“ und der jeweiligen Nummer können Sie eine Zutat auswählen.");
		System.out.println("Mit „ok“ können sie Ihre Burgerzusammenstellung abschließen.");
		System.out.println("Mit „meine burger“ wird ihre aktuelle Bestellung angezeigt.");
		System.out.println("Mit „bestellen“ wird die Bestellung abgeschlossen.");
		System.out.println("Bitte geben Sie ihre Wünsche ein: ");
		line = StaticScanner.nextString();
		action = line.split(" ");
	}
	
	public static void menu () {
		
	}
}
