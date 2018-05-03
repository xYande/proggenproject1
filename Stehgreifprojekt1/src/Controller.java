
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
		System.out.println("Bitte wählen Sie zuerst ein Burgerbrötchen Ihrer Wahl.");
		System.out.println("Hierbei stehen Ihnen 4 Sorten zur Auswahl. Bestätigen Sie die von Ihnen gewünschte Sorte mit der angegebenen Zahl.");
		System.out.println("Hamburger (Standard), 0,85€ (10)");
		System.out.println("Hamburger Sesam, 0,95€ (11)");
		System.out.println("Vegan-Brötchen, 0,55€ (12)");
		System.out.println("Ciabatta, 0,45€ (13)");
		line = StaticScanner.nextString();
		action = line.split(" ");
	}
	
	public static void menu () {
		
	}
}
