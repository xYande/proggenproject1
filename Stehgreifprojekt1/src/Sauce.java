
public class Sauce extends Zutat {

	private int menge;
	private String geschmack;
	
	public Sauce (String name, int nummer, float preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		super (name, nummer, preis, klassisch, vegan, vegetarisch);
		this.menge = menge;
		this.geschmack = geschmack;
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
