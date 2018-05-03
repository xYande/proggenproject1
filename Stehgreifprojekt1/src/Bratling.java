
public class Bratling extends Zutat {

	private int bratzeit;
	private int hoehe;
	
	public Bratling (String name, int nummer, float preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		super (name, nummer, preis, klassisch, vegan, vegetarisch);
		this.bratzeit = bratzeit;
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
