import model.bratling.Bratling;
import model.gemuese.Gemuese;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Controller {

	public static void main (String [] args) {

	    System.out.println("Willkommen bei BuildYourBurger!");
	    System.out.println();
	    System.out.println("Wollen sie die Befehle einmal ansehen?");
	    Scanner sc = new Scanner(System.in);
	    String input = sc.next();

	    while (!input.equals("ja") && !input.equals("nein")) {
            System.out.println();
            System.out.println ("Falsche Eingabe. Du sollst ja oder nein eingeben: ");
            input = sc.next();
        } if (input.equals("ja")) {
            System.out.println();
            System.out.println("Mit 'menu' können Sie sich die vollständigen Zutaten anzeigen lassen.");
            System.out.println("Mit 'zutat' und der jeweiligen Nummer können Sie eine Zutat auswählen.");
            System.out.println("Mit 'ok' können sie Ihre Burgerzusammenstellung abschließen.");
            System.out.println("Mit 'meine burger' wird ihre aktuelle Bestellung angezeigt.");
            System.out.println("Mit 'bestellen' wird die Bestellung abgeschlossen.");
            System.out.println("Rufen sie die Speisekarte mit 'menu' auf oder geben Sie etwas anderes ein, um mit der Bestellung zu beginnen. ");
                input = sc.next();
                if (input.equals("menu")) {
                menu();
                } else {
                System.out.println("Bitte nennen Sie uns ihre Zutaten. ");
                }
        } else if (input.equals("nein")) {
            System.out.println("Gut, dann bitte Ihre Bestellung.");
            System.out.println("Hier noch einmal die Speisekarte zur Erinnerung. ");
            menu();
            System.out.println("Welchen Zutaten wollen Sie haben?");
        }


	}

	public static void menu () {
		ArrayList<String> menue = new ArrayList<String>();
		menue.add("Hamburger                    mit der Nummer 10");
		menue.add("Sesam Hamburger              mit der Nummer 11");
		menue.add("Veganes Brötchen             mit der Nummer 12");
		menue.add("Ciabatta Brötchen            mit der Nummer 13");
		menue.add("Rindfleisch-Bratling         mit der Nummer 20");
		menue.add("gerillter Hähnchenbratling   mit der Nummer 21");
		menue.add("Falafel Bratling             mit der Nummer 22");
		menue.add("Gemüse-Bratling              mit der Nummer 23");
		menue.add("Eisbergsalat                 mit der Nummer 31");
		menue.add("Rucola                       mit der Nummer 32");
		menue.add("Tomaten                      mit der Nummer 40");
		menue.add("Salzgurken                   mit der Nummer 41");
		menue.add("Rote Zwiebelringe            mit der Nummer 42");
		menue.add("Jalapeno Ringe               mit der Nummer 43");
		menue.add("Ketchup                      mit der Nummer 50");
		menue.add("Sandwich-Sauce               mit der Nummer 51");
		menue.add("Chili-Sauce                  mit der Nummer 52");
		menue.add("Honig-Senf-Sauce             mit der Nummer 53");

		for(String element : menue) {
		    System.out.println(element);
		}
    }
}
