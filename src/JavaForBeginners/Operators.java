package JavaForBeginners;

public class Operators {
    public static void main(String[] args) {
        int left = 5;
        int right = 6;

        //Arithmetic Operators
        System.out.println("Addition: " + (left + right));
        System.out.println("Substraction: " + (left - right));
        System.out.println("Multiplication: " + (left * right));
        System.out.println("Division: "+ (left / right));
        System.out.println("Modulo: " + (left % right));
        System.out.println("Post Increment: " + left++);
        System.out.println("Post Decrement: " + right--);
        System.out.println("Pre Increment: " + ++left);
        System.out.println("Pre Decrement: " + --right);

        //Comparison Operators
        System.out.println("Less Than: " + (left < right));
        System.out.println("Equals: " + (left == right));
        System.out.println("Greater Than: " + (left > right));
        System.out.println("Greater or Equal: " + (left >= right));
        System.out.println("Less or Equal: " + (left <= right));

        //Logical Operators
        System.out.println("AND operator: " + ((left > right) && (right == left)));
        System.out.println("OR Than: " + ((left < right) || (right == left)));
        System.out.println("NOT operator: " + ((left != right)));

        //Assignment Operators
        System.out.println("Equals: " + (left = 9));
        System.out.println("Add: " + (left += 9));
        System.out.println("Substract: " + (left -= 9));

        //Bitwise Operators
        //Left is 9 which is 0000 1001 in Binary
        //Right is 8 which is 0000 1000 in Binary
        System.out.println("Bitwise AND: " + (left & right));
        //Result is 0000 1000 which is 8
        System.out.println("Bitwise OR: " + (left | right));
        //Result is 0000 1001 which is 9
        System.out.println("Bitwise Exclusive OR: " + (left ^ right));
        //Result is 0000 0001 which is 1
        System.out.println("Bitwise Complement: " + (~left));
        //Result is 1111 0110 which is -10
        System.out.println("Bitwise Left Shift: " + (right << 1));
        //Result is 0001 0000
        System.out.println("Bitwise Right Shift: " + (right >> 1));
        //Result is 0000 0100
        System.out.println("Right Zero Fill: " + (left >>> right));
        //Result is 0000 0000 which is 0
    }
}