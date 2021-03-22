package fr.comprendrejava.exercice_vehicule;

public class Moto extends Vehicule {

	protected Moto(String type_vehicule, String type_carb, int nombre_Roues, int vitess_max,int contenuR,int contenanceR) {
		super(type_vehicule, type_carb, nombre_Roues, vitess_max,contenuR,contenanceR);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "" + type_vehicule + "," + type_carb + ", " + nombre_Roues
				+ ", " + vitess_max + ","+ contenuR +","+contenanceR+"";
	}

	
	

}
