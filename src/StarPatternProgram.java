public class StarPatternProgram {
    public static void main(String[] args) {
        System.out.println("******Star Pattern Program********");

        for (int i = 0; i <=5; i++) {
            System.out.println(" ");
            for (int j = 5; j >=i; j--) {
                System.out.print("*");
            }

        }
    }
}
