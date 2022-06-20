package Taller2;
/**
 * Representa una clase de Nave Tripulada y varias de sus características, atributos y métodos elementales.
 * @author Juan Camilo Garcia Garcia
 *
 */
public class MannedShip extends Shipbuilder{
	/**
	* Representa el numero de pasajeros de la nave tripulante.
	*/
	private int numberPassengers;
	/**
	* Representa el tipo de la mision de la nave tripulante.
	*/
	private String typeMission;
	/**
	 * Establece el numero de pasajeros, el tipo de mision, el nombre, el material de construccion, el pais y la potencia de la nave
	 * @param numPasajeros numero de pasajeros de la nave tripulante
	 * @param tipoMision Tipo de mision de la nave tripulante
	 * @param shipName nombre de la nave
	 * @param constructionMaterial material con la que esta construida la nave
	 * @param country pais
	 * @param power potencia
	 */
	public MannedShip (int numberPassengers, String typeMission, String shipName, String constructionMaterial, String country, int power) {
		/**
		* Herencia de la clase padre
		*/
		super(shipName, constructionMaterial, country, power);
			this.numberPassengers=numberPassengers;
			this.typeMission=typeMission;
		}
		/**
		* Sobre escritura de metodo de la clase padre
		*/
		@Override
		public void characteristics() {
			
		}
		/**
		* Obtiene los valores para la nave tripulante.
		*/
		public String toString() {
			return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
					+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power+" Caballos"+"\nCapacidad de pasajeros: "+numberPassengers+""
					+ "\nTipo de Mision: "+typeMission;
		}
}
