package fr.comprendrejava.exercice_vehicule;

public class Voiture extends Vehicule {

	protected Voiture(String type_vehicule, String type_carb, int nombre_Roues, int vitess_max,int contenuR,int contenanceR) {
		super(type_vehicule, type_carb, nombre_Roues, vitess_max, contenanceR, contenuR);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "" +type_vehicule + "," + type_carb + "," + nombre_Roues +","+ vitess_max+ "";
			
	}

}
