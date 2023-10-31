import java.util.ArrayList;
import java.util.HashMap;

public class Loops {
    public static void main(String[] args) {

        String[] strArray = new String[5];
        strArray[0]="Anish";
        strArray[1]="Aarya";
        strArray[2]="Aarvi";
        strArray[3]="Aavya";
        strArray[4]="GuKhau";
        System.out.println(strArray.length);
        System.out.println("While Loop");
        int i=0 ;
        while (i< strArray.length){
            System.out.println("Value of Array at "+ i +" index is :  "+ strArray[i]);
            i++;
        }

        System.out.println("Do While Loop");
        i=0;
        do {
            System.out.println("Value of Array at "+ i +" index is :  "+ strArray[i]);
            i++;
        }while (i< strArray.length);

        System.out.println("For Loop");
        for(i=0; i<strArray.length;i++){
            System.out.println("Value of Array at "+ i +" index is :  "+ strArray[i]);
        }
        System.out.println("ForEach Loop");
        for(String s : strArray){
            System.out.println("Value of Array at "+ i +" index is :  "+ strArray[i]);
        }

        ArrayList<String> lst = new ArrayList<>();
        lst.add("Aarya");



    }

}
