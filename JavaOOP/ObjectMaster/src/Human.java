
public class Human {
	protected String name = "";
	protected int strength = 50;
	protected int stealth =3; 
	protected int health =100;
	protected int intelligence =3;
	
	public Human() {
		
	}
	
	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrangth() {
		return strength;
	}

	public void setStrangth(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Human human) {
		human.setHealth(human.getHealth()-strength);
	}
	
	
}
