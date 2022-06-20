package Taller2;
/**
 * Clase abstracta que mensionara las componentes de todas las naves espaciales
 * @author Juan Camilo Garcia Garcia
 *
 */
public class Spaceships {
	
	protected String shipName;
	protected String constructionMaterial;
	protected String country;
	protected int power;
	
	public Spaceships(String shipName, String constructionMaterial, String country, int power) {
		this.shipName = shipName;
		this.constructionMaterial = constructionMaterial;
		this.country = country;
		this.power = power;
	}
	
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getContructionMaterial() {
		return constructionMaterial;
	}
	public String getCountry() {
		return country;
	}
	public int getPower() {
		return power;
	}
	public String caracteristics() {
		return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
				+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power;
											
	}
}
