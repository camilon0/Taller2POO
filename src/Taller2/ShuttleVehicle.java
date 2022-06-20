package Taller2;

public class ShuttleVehicle extends Spaceships {
	private int thrustCapacity;
	private String loadType;
	public ShuttleVehicle(int thrustCapacity, String loadType, String shipName, String constructionMaterial, String country, int power) {
		super(shipName, constructionMaterial, country, power);
		
	}
	
	public int getThrustCapacity() {
		return thrustCapacity;
	}
	public String getLoadType() {
		return loadType;
	}
	
	@Override
	public String caracteristics() {
		return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
				+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power+"\nCapacidad de empuje: "+thrustCapacity+""
						+ "\nEl tipo de carga es: "+loadType;
	}

}
