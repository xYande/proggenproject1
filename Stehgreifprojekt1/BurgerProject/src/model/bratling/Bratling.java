package model.bratling;
import model.Zutat;

public abstract class Bratling extends Zutat {

    private int bratzeit;
    private int hoehe;

    public Bratling (String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
        super(name, nummer, preis, klassisch, vegan, vegetarisch);
        this.bratzeit = bratzeit;
        this.hoehe = hoehe;
    }
   public int zubereiten () {
        System.out.println("Ihr Burgerpatty wird gebraten und dauert " + bratzeit + "Sekunden bis es durch ist.");
        return bratzeit;
    }

    public double berechneHoehe () {
        double bratlingHoehe = (hoehe * 0.965) * bratzeit / 60;
        return bratlingHoehe;
    }
}
