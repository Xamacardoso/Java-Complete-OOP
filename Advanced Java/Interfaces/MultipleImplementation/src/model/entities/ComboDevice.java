package MultipleImplementation.src.model.entities;

// ComboDevice is a class that inherits everything from device, so it is a device.
// But it's also a Printer and a Scanner. That's why we can implement multiple interfaces.
public class ComboDevice extends Device implements Printer, Scanner {
    public ComboDevice() {}

    public ComboDevice(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo device processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo device printing: " + doc);
    }

    @Override
    public void scan(String doc) {
        System.out.println("Combo device scanning " + doc);
    }
}
