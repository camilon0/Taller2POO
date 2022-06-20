package Taller2;

public class FictionShips extends Spaceships{
	private int price;
	private String nameOfAi;
	
	public FictionShips(int price, String nameOfAi, String shipName, String constructionMaterial, String country, int power) {
		super(shipName, constructionMaterial, country, power);
		
	}
	
	public int getPrice() {
		return price;
	}
	public String getNameOfAi() {
		return nameOfAi;
	}
	
	@Override
	public String caracteristics() {
		return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
				+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power+"\nPrecio de la nave: "+price+""
						+ "\nNombre de la inteligencia Artificial que comanda: "+nameOfAi;
	}
	
}
