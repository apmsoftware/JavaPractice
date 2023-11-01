public class Arrays {
    public static void main(String[] args) {
        System.out.println("Declare Array");

        String[] strArray = new String[]{"Aarya","Anish","Aarvi","Aavya"};

        String[] newArray =concateArray(strArray);
        printArray(newArray);

    }

    private static String[] concateArray(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i] +"_"+i;
        }
        return strArr;
    }

    private static void printArray(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("Value of Array at "+i+" index : "+strArr[i]);
        }
    }
}
