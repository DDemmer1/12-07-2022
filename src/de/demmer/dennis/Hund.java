package de.demmer.dennis;

public class Hund {
	
	
	private int age;
	
	private String name;
	
	public Hund(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int convertDogAge(int humanAge) {

		return humanAge*7;
	}
	

}
