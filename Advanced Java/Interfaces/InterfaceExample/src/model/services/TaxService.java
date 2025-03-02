package InterfaceExample.src.model.services;

/* WHAT IS AN INTERFACE??
 * Interface is a special type that defines a set of operations
 * that a class MUST implement. It's like a contract that a worker
 * HAVES to follow. It is useful to create flexible systems.*/
public interface TaxService {
    Double tax(Double amount);
}
