package JavaForBeginners;

public class ObjectsAndClass_Computer {
    int RAM;
    String GPU;
    String HDD;
    String Motherboard;

    // Return Type, name of method (optional parameters)  {body of method}
    void showInfo() {
        System.out.println("The computer has " +RAM+ "of RAM and a " +Motherboard+ "motherboard");
    }

    String showSpecs() {
        return "The computer has " +RAM+ "of RAM and a " +Motherboard+ "motherboard";
    }
}
