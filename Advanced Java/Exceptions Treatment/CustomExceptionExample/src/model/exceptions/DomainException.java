package CustomExceptionExample.src.model.exceptions;

// A custom exception example
// If inheriting an Exception, the created exception must be thrown explicitly or treated
// If inheriting an RuntimeException, it mustn't be treated, but is a recommended practice
public class DomainException extends Exception {
    public DomainException(String message) {
        super(message);
    }
}
