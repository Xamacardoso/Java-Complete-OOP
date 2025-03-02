package DefaultMethods.src.model.services;

public class USInterestService implements InterestService{
    private Double interestRate;

    public USInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

}
