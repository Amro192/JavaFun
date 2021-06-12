import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class PuzzleJava{
//     public static ArrayList<Integer> puzzlesJava(int[] ar){
//         ArrayList<Integer> ListAr = new ArrayList<Integer>();
//         int sum =0;
//         for(int i=0; i<ar.length; i++){
//             sum = ar[i]+sum;
//             if(ar[i]>10){
//                 ListAr.add(ar[i]);
//             }
//         }
//         System.out.println(sum);
//         System.out.println(ListAr);
//         return ListAr;
//     }

    // public static ArrayList<String> shuffleJava(){
    //     ArrayList<String> ListAr = new ArrayList<String>();
    //     ArrayList<String> ar = new ArrayList<String>();
    //     ar.add("Nancy");
    //     ar.add("Jinichi");
    //     ar.add("Fujibayashi");
    //     ar.add("Momochi");
    //     ar.add("Ishikawa");
    //     int five = 5;
    //     for(String i : ar){
    //         if(i.length() > five){
    //             ListAr.add(i);
    //         }
    //     }
    // Collections.shuffle(ar);
    // System.out.print(ar);
    // System.out.println(ListAr);
    // return ar;
    // }}

    // public static void alphaletters(){
    //     char[] alpha = new char[26];
    //     for(int i = 0; i < 26; i++){
    //         alpha[i] = (char)(97 + i);} 

    //     Random rand = new Random();

    //     for(int i = 0; i < alpha.length; i++){
    //         int random = rand.nextInt(alpha.length);
    //         char temp = alpha[random];
    //         alpha[random] = alpha[i];
    //         alpha[i] = temp;
    //     }
    //     char last = alpha[alpha.length -1 ];
    //     System.out.println(last);
    //     for(int i = 0; i < 1; i++){
    //     if(alpha[i] == 'a' || alpha[i] == 'e' || alpha[i] == 'u' ||alpha[i] == 'i' ||alpha[i] == 'o'  ){
    //         System.out.println("It's Vowel !");
    //     }}

    //     System.out.print(Arrays.toString(alpha) + " ");
    // }
    // }


    // public static void randNumber (){
    //     int[] arr = new int[10];
    //     int max = 100;
    //     int min = 55;
    //     int range = max-min +1;
    //     for(int i  =0 ; i<10; i++){
    //         arr[i] = (int)(Math.random() * range) + min;
    //     }
    //     System.out.print(Arrays.toString(arr));
    // }


    // public static void randNumbersort(){
    //     int[] arr = new int[10];
    //     int max = 100;
    //     int min = 55;
    //     int range = max-min +1;
    //     for(int i  =0 ; i<10; i++){
    //         arr[i] = (int)(Math.random() * range) + min;
    //     }
    //     Arrays.sort(arr, 0, 10);
    //     System.out.print(Arrays.toString(arr));
    // }


    // public static void randString(){
    //     int n = 5;
    //     int lowerLimit = 97;
    //     int upperLimit = 122;
    //     String[] newAr = new String[10];        
    //     Random random = new Random();
    //     StringBuffer r = new StringBuffer(n);
    //     for(int x=0; x<newAr.length; x++){
    //         for (int i = 0; i < n; i++) {
    //         int nextRandomChar = lowerLimit+ (int)(random.nextFloat()* (upperLimit - lowerLimit + 1));
    //         r.append((char)nextRandomChar);
    //     }
    //     newAr[x] = r.toString();
    //     r.delete(0, r.length());}
    //     System.out.print(Arrays.toString(newAr));}}