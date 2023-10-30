import java.util.Scanner;

public class InputOutputExercise {
    public static void main(String[] args) {

        System.out.println("Accept Values from User and perform Addition ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Values : ");

        int EnteredVal = 0;
        int Add =0 ;

        while (scanner.hasNext()) {
            EnteredVal = Integer.parseInt(scanner.next());
            Add= Add + EnteredVal;
        }
        scanner.close();

        System.out.println("Addition is : " + Add);
    }
}