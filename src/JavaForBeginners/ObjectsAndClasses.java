package JavaForBeginners;

// Object is 'Computer'
public class ObjectsAndClasses {
    public static void main(String[] args) {
        // Calling objects from another class/file
        ObjectsAndClass_Computer computer = new ObjectsAndClass_Computer();
        computer.GPU = "Nvidia";
        computer.HDD = "WD";
        computer.Motherboard = "MSI";
        computer.RAM = 1024;

        String result = computer.showSpecs();
        System.out.println(result);
    }
}
