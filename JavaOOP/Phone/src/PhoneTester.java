public class PhoneTester {
    public static void main(String[] args) {
        Galaxy MI8 = new Galaxy("8Lite", 100, "AMRO-MI","TRRRR TRRRR");
        IPhone iPhone12 = new IPhone("12 Pro Max", 75, "Mutaz", "TRRNTR");
        MI8.displayInfo();
        iPhone12.displayInfo();
    }
}