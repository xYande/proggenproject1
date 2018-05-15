package model;

public abstract class Zutat {

	private String name;
	private int nummer;
	private double  preis;
	private boolean klassisch;
	private boolean vegan;
	private boolean vegetarisch;

	public Zutat (String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		this.name = name;
		this.nummer = nummer;
		this.preis = preis;
		this.klassisch = klassisch;
		this.vegan = vegan;
		this.vegetarisch = vegetarisch;		
	}
	
	public abstract int zubereiten ();

	
	public abstract int berechneHoehe();

}
