package payment;
public class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount){
        System.out.printf("Pagamento di %.2f€ effettuato con Carta di Credito n° %s\n", amount, cardNumber);
    }
}
