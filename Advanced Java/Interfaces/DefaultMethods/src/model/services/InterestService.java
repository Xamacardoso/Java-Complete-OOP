package DefaultMethods.src.model.services;

public interface InterestService {
    // This method is not default because it depends on the class that implements it
    Double getInterestRate();

    // A default method is a method that allows code reuse in an interface
    default Double payment(Double amount, Integer months){
        if (months < 1){
            throw new IllegalArgumentException("Months must be greater than 0");
        }

        return amount *  Math.pow(1.0 + getInterestRate() / 100.0, months);
    };
}
