import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if(num%3 == 0 && num%5 != 0){
            System.out.println("Fizz");
        }
        else if(num%3 != 0 && num%5 == 0){
            System.out.println("Buzz");
        }
        else if(num%3 == 0 && num%5 == 0){
            System.out.println("FizzBuzz");
        }
        else{
            System.out.println(num);
        }
    }
}