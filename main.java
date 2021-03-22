package fr.comprendrejava.exercice_vehicule;

public class main {

	public static void main(String[] args) {
	
		Moto moto1=new Moto("moto","essence",2,100,2,4);
		Voiture v1=new Voiture("golf","diesel",4,180,6,8);
		Voiture v2=new Voiture("porche","diesel",4,180,6,40);
		
		 System.out.println(v1);
		 System.out.println(moto1);
         v2.fairPlein("essence",600,30);
         
         System.out.println(v2);
	}
}
