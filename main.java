package fr.comprendrejava.exercice_vehicule;

public class main {

	public static void main(String[] args) {
	
		Moto moto1=new Moto("moto","essence",2,100,2,4);
		Voiture v1=new Voiture("golf","diesel",4,180,6,8);
		 System.out.println(v1);
		 System.out.println(moto1);
         moto1.fairPlein("essence",100,80);
         System.out.println(moto1);
	}
}
