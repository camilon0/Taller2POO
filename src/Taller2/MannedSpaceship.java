package Taller2;

public class MannedSpaceship extends Spaceships {	
	private int numPassengers;
	private String misionType;
	public MannedSpaceship(int numPassengers, String misionType, String shipName, String constructionMaterial, String country, int power) {
		super(shipName, constructionMaterial, country, power);
		
	}
	
	public int getNumPassengers() {
		return numPassengers;
	}
	public String getMisionType() {
		return misionType;
	}
	
	@Override
	public String caracteristics() {
		return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
				+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power+"\nNumero de pasajeros: "+numPassengers+""
				+"\nTipo de mision: "+misionType;
	}

}
