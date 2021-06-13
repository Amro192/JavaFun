
public class Samurai extends Human {
	static int samuraiCount=0;
	
	//Constructor
	
	public Samurai() {
		this.health=200;
		samuraiCount++;
	}
	
	public Samurai(String name) {
		this.health=200;
		this.name =name;
		samuraiCount++;
	}
	
	//Methods
	
	public void deathBlow(Human human) {
		human.setHealth(human.getHealth() - human.getHealth());
		this.setHealth(this.getHealth()/2);
	}
	
	public int howMany() {
		System.out.print(samuraiCount);
		return samuraiCount;
	}
}
