package MultipleImplementation.src.model.entities;

public final class ConcreteScanner extends Device implements Scanner {
    public ConcreteScanner() {}

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public void scan(String doc) {
        System.out.println("Scanner scanning: " + doc);
    }
}
