import java.util.ArrayList;
public class BasicJava {
    // public void TowHundred(){
    //     int i =0 ;
    //     while (i<255){
    //         System.out.print(i);
    //         i++;
    //     }
    //    }
    public void TowHundredArray(){
        int i = 0;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        while(i<255){
            i = i+i;
            myList.add(i);
        }
        for (int x = 0; x < myList.size(); x++){
        System.out.println(myList.get(x));}
    }

}