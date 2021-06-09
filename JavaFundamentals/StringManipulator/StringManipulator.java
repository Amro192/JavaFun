public class StringManipulator{
    public static String TrimAndConcat(String str1 , String str2){
        str1 = "     hello     ";
        str2=  "     world     ";
        return str1.trim().concat(str2.trim());
    }
}