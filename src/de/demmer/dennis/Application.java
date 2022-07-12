package de.demmer.dennis;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Application {
	
	
	public static void main(String[] args) {
		
		Hund hund1 = new Hund(7,"Bello");
		Hund hund2 = new Hund(19,"Clara");
		Hund hund3 = new Hund(10,"Wuffi");

		boolean test = true;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		Hund[] hundArray = new Hund[5];
		hundArray[0] = hund1;
		hundArray[1] = hund2;
		hundArray[2] = hund3;

		
		
		hundArray[2].getAge();
		
		Catchable p = new Pokemon(100,"Pikachu");
		
		System.out.println(p.catchPokemon());
		
		
//		STRG + SHIFT +O = AUTO IMPORT
		HashMap<String, List<File>> index = new HashMap<>();
		
		
		index.put("Hund", new ArrayList<>());
		
		index.get("Hund").add(new File("faust.txt"));
		index.get("Hund").add(new File("herr_der_ringe.txt"));

		
		
		for (File text : index.get("Hund")) {
			System.out.println(text.getName());
		}
		
		
		
		
		
	}

}
