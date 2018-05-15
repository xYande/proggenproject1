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



}
