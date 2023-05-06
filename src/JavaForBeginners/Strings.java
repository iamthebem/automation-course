package JavaForBeginners;

public class Strings {
    public static void main(String[] args) {
        String text = new String();
        text = "Hello";

        String secondText = " World";
        String thirdText = text + secondText;

        System.out.println(thirdText);

        // Comparing strings
        if (text.equals(secondText)) {
            System.out.println(secondText);
        }
    }
}
