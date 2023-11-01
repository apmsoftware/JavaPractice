import java.util.ArrayList;

public class MethodsPractice {
    public static void main(String[] args) {
        System.out.println("Write a function Accepts Arraylist and String and returns index of String in Arraylist");
        ArrayList<String> lst =new ArrayList<>();
        lst.add("Anish");
        lst.add("Aarya");
        lst.add("Aarvi");
        lst.add("Aavya");

       int index = returnArryaIndex(lst,"Aarvi");
        System.out.println("Input String is present at index : " +index);
    }

    public static int returnArryaIndex(ArrayList<String> list,String str){

       int index= list.indexOf(str);
       return index;

    }
}
