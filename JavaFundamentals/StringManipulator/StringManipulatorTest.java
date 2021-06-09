public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator iD = new StringManipulator();
        String Manipulate = iD.concatSubstring("Hello world" , 1 , 2, "llo");
        System.out.println(Manipulate);
    }
}