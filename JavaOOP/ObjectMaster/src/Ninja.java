
public class Ninja extends Human{
	public Ninja(){
		this.stealth=10;
	}
	
	public Ninja(String name){
		this.stealth=10;
		this.name=name;
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}
}
