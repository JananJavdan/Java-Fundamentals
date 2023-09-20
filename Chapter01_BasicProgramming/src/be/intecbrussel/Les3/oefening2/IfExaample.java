package be.intecbrussel.Les3.oefening2;

public class IfExaample {
    public static void main(String[] args) {
        int number = 110;
        if(number<100){
            // this line is printed out when number is smaller than 100!when the condition is TRUE
            System.out.println("The value of number is smaller than 100");
        }
        else{
            //this line is printed out when number is NOT smaller than 100!when thr condition is FALSE
            System.out.println("The value of number is NOT smaller than 100");
        }

        int time = 22;
        if(time<10){
            System.out.println("Good morning.");
        }
        else if (time<20){
            System.out.println("Good day");
        }
        else {
            System.out.println("Good evening");
        }
        int day = 4;
        switch (day){
            case 1:
            System.out.println("Monday");
            break;
            case  2:
            System.out.println("Tuesday");
            break;
            case  3:
            System.out.println("wednesday");
            break;
            case  4:
            System.out.println("Thursday");
            break;
            case  5:
            System.out.println("Friday");
            break;
            case  6:
            System.out.println("Saturday");
            break;
            case  7:
            System.out.println("Sunday");
            break;
            default:
                System.out.println("Day number doesn't exists");
                break;
        }



    }
}
