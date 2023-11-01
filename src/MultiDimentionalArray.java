public class MultiDimentionalArray {
    public static void main(String[] args) {
        System.out.println("Multi Dimentional Arrya Practice");

        int[][] multiArr = new int[3][3];

        multiArr[0][0] =1;
        multiArr[0][1] =2;
        multiArr[0][2] =3;

        multiArr[1][0] =4;
        multiArr[1][1] =5;
        multiArr[1][2] =6;

        multiArr[2][0] =7;
        multiArr[2][1] =8;
        multiArr[2][2] =9;

        System.out.println("Print Multi Dimentional Array");
        printArray(multiArr);


    }

    private static void printArray(int[][] multiArr) {
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(multiArr[i][j]+" ");

            }

        }
    }
}
