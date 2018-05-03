	
public class Gemuese extends Zutat {

	private int scheibenDicke;
	private int scheibenAnzahl;
	
	public Gemuese (String name, int nummer, float preis, boolean klassisch) {
		super (name, nummer, preis, klassisch, true, true);
		this.scheibenAnzahl = scheibenAnzahl;
		this.scheibenDicke = scheibenDicke;
	}
	public int zubereiten () {
		return nummer;
		
	}
	
	public int berechneHoehe () {
		return nummer;
		
	}
	
	public string toString () {
		return string;
	}
}
