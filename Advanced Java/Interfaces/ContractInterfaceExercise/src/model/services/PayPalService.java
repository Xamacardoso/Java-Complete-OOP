package ContractInterfaceExercise.src.model.services;

public final class PayPalService implements OnlinePaymentService {

    @Override
    public Double paymentFee(Double amount){
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months){
        return amount * (months * 0.01);
    }
}
