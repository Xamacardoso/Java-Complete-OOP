package ContractInterfaceExercise.src.model.services;

import ContractInterfaceExercise.src.model.entities.Contract;
import ContractInterfaceExercise.src.model.entities.Installment;

import java.util.Calendar;
import java.util.List;

public class ContractService {

    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {
        Double baseAmount = contract.getTotalValue() / months;
        List<Installment> installments = contract.getInstallments();

        Calendar calendar = Calendar.getInstance();

        for (int i = 1; i <= months; i++) {
            calendar.setTime(contract.getDate());
            calendar.add(Calendar.MONTH, i);

            Double totalAmount = baseAmount + paymentService.interest(baseAmount, i);
            totalAmount += paymentService.paymentFee(totalAmount);

            installments.add(new Installment(totalAmount, calendar.getTime()));
        }

        System.out.println("Contract processed successfully!");
    }
}
