import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class InputMethodsJava {
    public static void main(String[] args) throws IOException {
//        System.out.println("Input Mrthods In Java : 1. Buffered Reader");

        // Creating an object of inputStream reader which accepts stream of Bytes given as Input
//        InputStreamReader inputStreamReader =new InputStreamReader(System.in);
//
//        // Buffered reader converts  stream of Bytes to stream of characters
//        BufferedReader reader = new BufferedReader(inputStreamReader);
//
//        System.out.println("Enter your Input Stream : ");
//
//        String myString = reader.readLine();
//        System.out.println("you have Entered "+ myString);
//        reader.close();


        System.out.println("Input Mrthods In Java : 2. Scanner");

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your Input Stream : ");
        while (scanner.hasNextLine()){
            String myString1 = scanner.nextLine();
            System.out.println("you have Entered "+ myString1);
        }

    }
}
