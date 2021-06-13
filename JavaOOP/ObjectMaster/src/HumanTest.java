
public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("Amro");
		Human testHuman2 = new Human("Yasar");
		System.out.println(testHuman2.getHealth());
		testHuman1.attack(testHuman2);
		System.out.println(testHuman2.getHealth());
	}

}
