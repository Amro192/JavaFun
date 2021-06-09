import java.util.Scanner;
import java.lang.Math;

public class Pyth {
    public double calculateHypotenuse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inter First Number");
        double legA = in.nextDouble();
        
        System.out.println("Inter Second Number");
        double legB = in.nextDouble() ;
        
        double power = (Math.pow(legA,2) + Math.pow(legB,2));
        double squareRoot = Math.sqrt(power);
        return squareRoot;
    }
}
