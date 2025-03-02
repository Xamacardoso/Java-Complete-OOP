package MultipleImplementation.src.model.entities;

// This is a printer implementation, now that printer is an interface (A combo device can also be a printer)
public final class ConcretePrinter extends Device implements Printer {
    public ConcretePrinter() {}

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printer printing: " + doc);
    }
}
