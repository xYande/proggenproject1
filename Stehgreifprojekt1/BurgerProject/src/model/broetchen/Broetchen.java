package model.broetchen;
import model.Zutat;

public abstract class Broetchen extends Zutat {

	private int backzeit;
	private int hoehe;
	
	public Broetchen (String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		super (name, nummer, preis, klassisch, vegan, vegetarisch);
		this.backzeit = backzeit;
		this.hoehe = hoehe;
	}
	
	public int zubereiten () {
		return 0;
	}

	public int berechneHoehe () {
		return 0;
	}
}
