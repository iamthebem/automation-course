package JavaForBeginners;

public class ForLoops {
    public static void main(String[] args) {
        // counter (times the loop will run), condition that stops the loop, action as loop progresses
        System.out.println("For Loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("The i variable is " + i);
        }
        System.out.println();
        // Transverse arrays
        System.out.println("Transverse Array");
        int [] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        // Inner loops
        System.out.println("Inner loops");
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i is: " + i);
            for (int k = 0; k < 3; k++) {
                System.out.println("Value of k is: " + k);
            }
        }
    }
}
