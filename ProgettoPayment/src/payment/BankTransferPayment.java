package payment;
public class BankTransferPayment implements Payment{
    String iban;

    public BankTransferPayment(String iban){
        this.iban = iban;
    }
    public void pay(double amount){
        System.out.printf("Pagamento di %.2f effettuato tramite bonifico con Iban: %s", amount, iban);
    }
}
