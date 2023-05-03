package JavaForBeginners;

public class Arrays {
    public static void main(String[] args) {
        int integer = 55;
        int [] myArray;
        // int [] myArray = new int[3];
        // Determine size of Array
        myArray = new int[3];
        // Different way to instantiate Array
        int[] myArray2 = {1, 2, 3};
        // Specifying index, starting t 0
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
    }
}
