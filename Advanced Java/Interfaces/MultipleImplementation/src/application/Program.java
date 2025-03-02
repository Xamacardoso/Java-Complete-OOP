package MultipleImplementation.src.application;

import MultipleImplementation.src.model.entities.ComboDevice;
import MultipleImplementation.src.model.entities.ConcretePrinter;
import MultipleImplementation.src.model.entities.ConcreteScanner;
import MultipleImplementation.src.model.entities.Device;

public class Program {
    public static void main(String[] args) {
        ConcreteScanner device1 = new ConcreteScanner("123");
        ConcretePrinter device2 = new ConcretePrinter("456");
        ComboDevice device3 = new ComboDevice("789");

        device1.processDoc("SCANNER DOC");
        device2.processDoc("PRINTER DOC");

        System.out.println();

        device1.scan("SCANNER SCANNING");
        device2.print("PRINTER PRINTING");

        // Note that a combo device makes the two operations. It's not because
        // it inherits from both scanner and printer classes, but it's because
        // it implements both interfaces, and only inherits from Device class.
        // For this reason, it can also process doc too.
        device3.processDoc("COMBO DEVICE DOC");
        device3.print("COMBO DEVICE SCANNING");
        device3.print("COMBO DEVICE PRINTING");
    }
}
