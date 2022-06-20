package Taller2;
/**
 * Representa una clase de Nave no Tripulada y varias de sus características, atributos y métodos elementales.
 * @author Juan Camilo Garcia Garcia
 *
 */
public class UnmannedShip extends Shipbuilder{
	/**
	* Representa la duracion de la mision de la nave no tripulada.
    */
	private int duration;
	/**
	* Representa el planeta de la mision de la nave no tripulada.
    */
	private String planet;
	/**
	 * Establece la duracion de la mision, el planeta de la mision, el nombre, el material de construccion, el pais y la potencia de la nave
	 * @param duracion
	 * @param planeta
	 * @param shipName
	 * @param constructionMaterial
	 * @param country
	 * @param power
	 */
	public UnmannedShip (int duration, String planet, String shipName, String constructionMaterial, String country, int power) {
		/**
		 * Herencia de la clase padre
		 */
		super(shipName, constructionMaterial, country, power);
			this.duration=duration;
			this.planet=planet;
		}
		/**
		 * Sobre escritura de metodo de la clase padre
		 */
		@Override
		public void characteristics() {
			
		}
		/**
		 * Obtiene los valores para la nave no tripulante.
		 */
		public String toString() {
			return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
					+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power+" Caballos"+"\nPlaneta a explorar: "+planet+""
					+ "\nDuracion de la mision: "+duration+" Años";
		}
}
