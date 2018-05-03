
public class Salat extends Zutat {

	public Salat (String name, int nummer, float preis, boolean klassisch) {
		super (name, nummer, preis, klassisch, true, true);
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
