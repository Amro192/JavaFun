import java.util.ArrayList;
public class BasicJava {
    // public Integer TowHundred(){
    //     int i =0 ;
    //     while (i<255){
    //         System.out.print(i);
    //         i++;
    //     }
    //     return i;}
    public Integer TowHundredArray(){
        int i = 0;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        while(i<255){
            i = i+i;
            myList.add(i);
        }
        for (int x = 0; x < myList.size(); x++){
        System.out.println(myList.get(x));}
        int y =0;
        return y;
    }

}