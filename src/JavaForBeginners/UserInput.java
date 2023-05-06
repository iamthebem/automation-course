package JavaForBeginners;
// Import Object
import java.util.Scanner;

public class UserInput {
    public static void main (String[] args) {
        System.out.println("Enter your number then press Enter key");
        Scanner input = new Scanner(System.in);
        // String text = input.nextLine();
        int number = input.nextInt();
        System.out.println(number);
    }
}
