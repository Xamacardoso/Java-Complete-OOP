package ContractInterfaceExercise.src.application;

import ContractInterfaceExercise.src.model.entities.Contract;
import ContractInterfaceExercise.src.model.entities.Installment;
import ContractInterfaceExercise.src.model.services.ContractService;
import ContractInterfaceExercise.src.model.services.PayPalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
    * Uma empresa deseja automatizar o processamento de seus contratos.
    * O processamento de um contrato consiste em gerar as parcelas a serem pagas para aquele
    * contrato, com base nonúmero de meses desejado.
    *
    * A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
    *
    * Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxapor pagamento.
    *
    * Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplicajuros simples de 1% a cada parcela,
    * mais uma taxa de pagamento de 2%.
    * Fazer um programa para ler os dados de um contrato (número do contrato,
    * data do contrato,e valor total do contrato).
    *
    * Em seguida, o programa deve ler o número de meses para parcelamento do contrato,
    * e daí gerar os registros de parcelas a serem pagas (data e valor),
    * sendo a primeira parcela a ser paga um mês após a data do contrato,
    * a segunda parcela doismeses após o contrato e assim por diante.
    * Mostrar os dados das parcelas na tela.
    * */
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data: ");
        System.out.print("Contract number: ");
        Integer contractNumber = sc.nextInt();

        System.out.print("Contract date (dd/MM/yyyy): ");
        Date contractDate = dateFormat.parse(sc.next());

        System.out.print("Contract total value: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, totalValue);
        ContractService service = new ContractService(new PayPalService());

        System.out.print("Enter the number of installments: ");
        Integer months = sc.nextInt();

        service.processContract(contract, months);
        System.out.println("===== INSTALLMENTS =====");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment.toString());
        }

        sc.close();
    }
}
