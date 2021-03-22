package fr.comprendrejava.exercice_vehicule;

public abstract class Vehicule {


protected String type_vehicule,type_carb;
protected int nombre_Roues,vitess_max,contenanceR,contenuR;

protected Vehicule(String type_vehicule, String type_carb, int nombre_Roues, int vitess_max,int contenuR,int contenanceR) {
	super();
	this.type_vehicule = type_vehicule;
	this.type_carb = type_carb;
	this.nombre_Roues = nombre_Roues;
	this.vitess_max = vitess_max;
	this.contenanceR= contenanceR;
	this.contenuR= contenuR;
	
}
public String getType_vehicule() {
	return type_vehicule;
}
public void setType_vehicule(String type_vehicule) {
	this.type_vehicule = type_vehicule;
}
public String getType_carb() {
	return type_carb;
}
public void setType_carb(String type_carb) {
	this.type_carb = type_carb;
}
public int getNombre_Roues() {
	return nombre_Roues;
}
public void setNombre_Roues(int nombre_Roues) {
	this.nombre_Roues = nombre_Roues;
}
public int getVitess_max() {
	return vitess_max;
}
public void setVitess_max(int vitess_max) {
	this.vitess_max = vitess_max;
}
public void contenanceR() {
	
}
public void contenueR() {
	
}
public void  fairPlein(String type_carburant, int contenance,int contenu) {
	type_carburant=type_carb;
	contenuR=contenanceR;
	contenu=contenance-(contenanceR-contenuR);
System.out.println(" a fait le plein");
}
}
