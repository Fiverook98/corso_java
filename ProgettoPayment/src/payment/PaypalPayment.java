package payment;
public class PaypalPayment implements Payment {
    String email;

    public PaypalPayment(String email){
        this.email = email;
    }

    public void pay(double amount){
        System.out.printf("Pagamento di %.2f effettuato attraverso Paypal con email: %s", amount , email);
    }
}
