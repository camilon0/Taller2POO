package Taller2;
/**
 * Representa una clase de Nave Lanzadera y varias de sus características, atributos y métodos elementales.
 * @author Juan Camilo Garcia Garcia
 *
 */
public class ShuttleShip extends Shipbuilder{
	/**
	 * Representa el peso de una Nave Lanzadera.
	 */
	private int weight;
	/**
	 * Representa el tipo de Nave Lanzadera.
	 */
	private String typeLoad;
	/**
	 * Establece el peso, el tipo de carga, el nombre, el material de construccion, el pais y la potencia de la nave
	 * @param peso preso de la nave
	 * @param TipoCarga tipo de la carga
	 * @param shipName nombre de la nave
	 * @param constructionMaterial material con la que esta construida la nave
	 * @param country pais
	 * @param power potencia
	 */
	public ShuttleShip (int weight, String typeLoad, String shipName, String constructionMaterial, String country, int power) {
		/**
		 * Herencia de la clase padre
		 */
		super(shipName, constructionMaterial, country, power);
			this.weight=weight;
			this.typeLoad=typeLoad;
		}
		/**
		* Sobre escritura de metodo de la clase padre
	 	*/
		@Override
		public void characteristics() {
			
		}
		/**
		 * Obtiene los valores para la nave lanzadera.
		 */
		public String toString() {
			return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
					+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power+" Caballos"+"\nPeso : "+weight+" Toneladas"
					+ "\nTipo de Carga: "+typeLoad;
		}
		
}