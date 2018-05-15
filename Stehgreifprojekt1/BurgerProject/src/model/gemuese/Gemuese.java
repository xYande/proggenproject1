package model.gemuese;
import model.Zutat;

public abstract class Gemuese extends Zutat {

	private int scheibenDicke;
	private int scheibenAnzahl;
	
	public Gemuese (String name, int nummer, double  preis, boolean klassisch) {
		super(name, nummer, preis, klassisch, true, true);
		this.scheibenAnzahl = scheibenAnzahl;
		this.scheibenDicke = scheibenDicke;
	}
	
	public int zubereiten () {
		int zubereitungszeit = scheibenAnzahl*1;
		return zubereitungszeit;
	}
	
	public int berechneHoehe () {
		return 0;	
	}
	
//	public String toString () {
//		return String;
//	}
}
