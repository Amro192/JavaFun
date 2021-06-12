import java.util.ArrayList;
public class ListsofExceptions{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(13);
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbey World");

    for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch(ClassCastException e ) {
                System.out.println(e);
            }
        }
    }
}