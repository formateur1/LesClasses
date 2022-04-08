package com.intiformation;

import java.util.Scanner;

public class Voiture {
	
	// Attributs
	// Pincipe encapsulation : déclarer les attributs private (ou protected) et utiliser des getters and setters
	private String plaqueImmatriculation;
	private String marque;
	private int vitesse;
	
	// Constructeur par défaut
	public Voiture()
	{
//		marque = "Mercedes";
//		vitesse = 0;
	}
	
	// Constructeur surchargé
	public Voiture(String marque)
	{
		this.marque = marque;
	}

	// Autre constructeur surchargé
	public Voiture(String plaqueImmatriculation, String marque, int vitesse) {
		super();
		this.plaqueImmatriculation = plaqueImmatriculation;
		this.marque = marque;
		this.vitesse = vitesse;
	}
	
	// Fonctions 
	public void accelerer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir a pour accelerer ou autres pour pas accelerer");
		char caractere = sc.next().charAt(0);
		if(caractere == 'a')
		{
			vitesse += 10;
		}
	}
	
	public int freiner(char caractere)
	{
		if(caractere == 'f')
		{
			vitesse -= 10;
		}
		return vitesse;
	}
	
	// getters and setters
	public String getMarque()
	{
		return marque;
	}
	
	public void setMarque(String marque)
	{
		this.marque = marque;
	}

	public String getPlaqueImmatriculation() {
		return plaqueImmatriculation;
	}

	public void setPlaqueImmatriculation(String plaqueImmatriculation) {
		this.plaqueImmatriculation = plaqueImmatriculation;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	
	
}
