package entities;

public class CurrencyConverter {
    // Static attribute, one that is not defined in a instance of a class
    public static final double IOF = 0.06;

    // Static method. Can be called without instantiating this class
    public static double dollarToReal(double dollars, double dollarPrice){
        double reaisPrice = dollars * dollarPrice;
        reaisPrice += reaisPrice * IOF;
        return reaisPrice;
    }
}
