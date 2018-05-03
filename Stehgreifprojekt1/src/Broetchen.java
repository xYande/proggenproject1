
public class Broetchen extends Zutat {

	private int backzeit;
	private int hoehe;
	
	public Broetchen (String name, int nummer, float preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		super (name, nummer, preis, klassisch, vegan, vegetarisch);
		this.backzeit = backzeit;
		this.hoehe = hoehe;
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
