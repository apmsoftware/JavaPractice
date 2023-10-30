public class FlowControlJava {
    public static void main(String[] args) {

        System.out.println("Flow Control : if Statement");

        int i1 =10;
        if ( i1== 10) {
            System.out.println("i is "+ i1);
        }

        System.out.println("Flow Control : if-else Statement");

        int i =60;
        if ( i == 10) {
            System.out.println("i is "+ i);
        } else{
            System.out.println("i is not 10, i: "+ i);
        }

        System.out.println("Flow Control : else-if Statement");

        int i3 =90;
        if ( i3 == 10) {
            System.out.println("i3 is 10");
        } else if(i3==60){
            System.out.println("i3 is 60");
        } else if(i3==80){
            System.out.println("i3 is 80");
        } else {
            System.out.println("i3 is :"+i3);
        }

        System.out.println("Flow Control : Switch Case");

        int i4 = 50;

        switch(i4)
        {
            case 10:
                System.out.println("i is 10");
                break;
            case 20:
                System.out.println("i is 20");
                break;
            case 30:
                System.out.println("i is 30");
                break;
            case 40:
                System.out.println("i is 40");
                break;
            case 50:
                System.out.println("i is 50");
                break;
            default:
                System.out.println("i is "+ i4);
                break;
        }

        String days ="Wednesday";

        switch (days){
            case "Monday":
                System.out.println("Day is Monday");
                break;
            case "Tuesday":
                System.out.println("Day is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Day is Wednesday");
                break;
            default:
                System.out.println("Day is "+days);
                break;



        }

    }


}
