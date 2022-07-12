package de.demmer.dennis;

public class Pokemon implements Catchable{

	private int hp;
	private String name;

	public Pokemon(int hp, String name) {
		super();
		this.hp = hp;
		this.name = name;
	}

//	STRG +SHIFT +F = Code Schön

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public boolean catchPokemon() {
		System.out.println(getName());
		System.out.println("Hurra du hast das Pokemon gefangen");
		return true;
	}

}
