package com.intiformation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// On instancie un objet v1 de la classe Voiture
		Voiture v1 = new Voiture();
		v1.setMarque("Mercedes");
		v1.setPlaqueImmatriculation("AA-123-BB");
		v1.setVitesse(70);
		
		Voiture v2 = new Voiture();
		
		System.out.println("Marque : " + v1.getMarque() + ", vitesse : " + v1.getVitesse());
		System.out.println("Marque : " + v2.getMarque() + ", vitesse : " + v2.getVitesse());
		
		System.out.println("Saisir la marque de votre voiture : ");
		String m = sc.next();
		Voiture v3 = new Voiture(m);

		System.out.println("Marque : " + v3.getMarque() + ", vitesse : " + v3.getVitesse());
		
		Voiture v4 = new Voiture("CC-456-DD", "Audi", 50);
		System.out.println("Marque : " + v4.getMarque() + ", vitesse : " + v4.getVitesse());
		
		v4.accelerer();
		
		System.out.println("Marque : " + v4.getMarque() + ", vitesse : " + v4.getVitesse());
		
		System.out.println("Saisir f pour freiner ou autres pour pas freiner");
		char c = sc.next().charAt(0);
		System.out.println("Marque : " + v4.getMarque() + ", vitesse : " + v4.freiner(c));
		
		
	}

}
