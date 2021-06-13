
public class Wizard extends Human{
	public Wizard(){
		this.health=50;
		this.intelligence = 8;
		
	}
	
	public Wizard(String name) {
		this.health=50;
		this.intelligence=8;
		this.name=name;
	}


	public void heal(Human human) {
		human.setHealth(human.getHealth()+intelligence);
	}
	
	public void fireball(Human human) {
		human.setHealth(human.getHealth()*(intelligence*3));
		
	}
	}
	