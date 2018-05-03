
public class Zutat {

	private String name;
	private int nummer;
	private float preis;
	private boolean klassisch;
	private boolean vegan;
	private boolean vegetarisch;
	
	public Zutat (String name, int nummer, float preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		this.name = name;
		this.nummer = nummer;
		this.preis = preis;
		this.klassisch = klassisch;
		this.vegan = vegan;
		this.vegetarisch = vegetarisch;
		
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
