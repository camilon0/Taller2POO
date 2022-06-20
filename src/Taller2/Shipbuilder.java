package Taller2;
/**
 * Representa una clase abstracta de un creador de naves espaciales y varias de sus características, atributos y métodos elementales.
 * @author Juan Camilo Garcia Garcia
 *
 *Version: 2.0.0
 */

public abstract class Shipbuilder {
	/**
	 * Representa el nombre que de una nave espacial.
	 */
	protected String shipName;
	/**
	 * Representa el nombre del material de construccion de una nave espacial.
	 */
	protected String constructionMaterial;
	/**
	 * Representa el nombre del pais una nave espacial.
	 */
	protected String country;
	/**
	 * Representa la potencia de una nave espacial.
	 */
	protected int power;
	/**
	 * Establece el nombre, el material de construccion, el pais y la potencia de una nave
	 * @param shipName
	 * @param constructionMaterial
	 * @param country
	 * @param power
	 */
	public Shipbuilder(String shipName,String constructionMaterial,String country,int power) {
		this.shipName=shipName;
		this.constructionMaterial=constructionMaterial;
		this.country=country;
		this.power=power;
	}
	/**
	 * Metodo abstracto, establece las caracteristicas que heredaran cada nave
	 */
	
	abstract public void characteristics();
	
	
}