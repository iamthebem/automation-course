package JavaForBeginners;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 7");
        // int dayOfWeek = 8;
        Scanner number = new Scanner(System.in);
        int dayOfWeek = number.nextInt();



        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No such day of week.");

        }
    }
}
