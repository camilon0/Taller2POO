package Taller2;
/**
 * Representa una clase de Nave de Ficcion y varias de sus características, atributos y métodos elementales.
 * @author Juan Camilo Garcia Garcia
 *
 */
public class FictionShip extends Shipbuilder{
	/**
	 * Representa el precio de una nave de ficcion.
	 */
	private int price;
	/**
	 * Representa el nombre de la inteligencia artificial de una nave espacial.
	 */
	private String nameOfAi;
	/**
	 * Establece el precio, el nombre de la inteligencia artificial, el nombre, el material de construccion, el pais y la potencia de la nave
	 * @param price precio de la nave
	 * @param nameOfAi nombre de la inteligencia artificial
	 * @param shipName nombre de la nave
	 * @param constructionMaterial material con la que esta construida la nave
	 * @param country pais
	 * @param power potencia
	 */
	public FictionShip (int price, String nameOfAi, String shipName, String constructionMaterial, String country, int power) {
		/**
		 * Herencia de la clase padre
		 */
		super(shipName, constructionMaterial, country, power);
			this.price=price;
			this.nameOfAi=nameOfAi;
		}
		/**
		 * Sobre escritura de metodo de la clase padre
		 */
		@Override
		public void characteristics() {
			
		}
		/**
		 * Obtiene los valores para la nave de Ficcion.
		 */
		public String toString() {
			
			return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
					+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power+" Caballos"+"\nPrecio de la nave: "+price+" Miles de millones (USD)"
				+ "\nNombre de la inteligencia Artificial que comanda: "+nameOfAi;
		}
				
}
