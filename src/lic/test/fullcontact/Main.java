package lic.test.fullcontact;

import java.util.Collections;

public class Main {

	
	//le parametre apiKey fourni avec la fiche du test d'evaluation
	static String apiKey ="b5e10d018d9af22c";
	
	public static void main(String[] args) {
		
		PersonHandler personHandler = new PersonHandler(apiKey);
		
		// test avec lutilisateur salaheddine1 :le compte facebook de l'auteur de ce code :)
		String salahPerson = personHandler.getPersonInfoByFacebookUsername("salaheddine1");
		
		// affichage au format xml du resultat 
		System.out.println(salahPerson);
		
		
	}

}
