package de.demmer.dennis;

public class Application {
	
	
	public static void main(String[] args) {
		
		Hund hund1 = new Hund(7,"Bello");
		Hund hund2 = new Hund(19,"Clara");
		Hund hund3 = new Hund(10,"Wuffi");

		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		
		Hund[] hundArray = new Hund[5];
		hundArray[0] = hund1;
		hundArray[1] = hund2;
		hundArray[2] = hund3;

		
		
		hund1.setAge(8);
		
		
		
	}

}
