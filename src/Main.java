import payments.*;

public class Main {
    public static void main(String[] args) {
        Payment cardPayment = PaymentFactory.createPayment("Card", 150.0, "1234-5678-9876-5432", "12/25", "123");
        cardPayment.pay();

        Payment paypalPayment = PaymentFactory.createPayment("PayPal", 200.0, "paypal_token_12345");
        paypalPayment.pay();
    }

}
