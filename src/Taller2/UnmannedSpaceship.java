package Taller2;

public class UnmannedSpaceship extends Spaceships {
	private String planetForStudy;
	private int studyDuration;
	public UnmannedSpaceship(String planetForStudy, int studyDuration, String shipName, String constructionMaterial, String country, int power) {
		super(shipName, constructionMaterial, country, power);
		
	}
	
	public String getPlanetForStudy() {
		return planetForStudy;
	}
	
	public int getStudyDuration() {
		return studyDuration;
	}
	
	@Override
	public String caracteristics() {
		return "Nombre de la nave: "+shipName+"\nMaterial de construccion: "+constructionMaterial+""
				+ "\nPais de la nave: "+country+"\nPotencia de la nave: "+power+"\nPlaneta por estudiar: "+planetForStudy+""
						+ "\nDuracion del estudio "+studyDuration;
	}

}
