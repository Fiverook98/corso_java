// import payment.*;
import payment.CreditCardPayment;
import payment.BankTransferPayment;
import payment.PaypalPayment;
import payment.PaymentProcessor;
// import payment.Payment;
public class Main {
    public static void main(String[] args) {
        payment.Payment creditCard = new CreditCardPayment("1569");
        payment.Payment paypalPay = new PaypalPayment("user@examples.com");
        payment.Payment transfer = new BankTransferPayment("IT65E6474");

        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(creditCard, 100.5);
        processor.processPayment(paypalPay, 200.75);
        processor.processPayment(transfer, 350);
    }
}
