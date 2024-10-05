import payments.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> paypalCredentials = Map.of("email", "aman@gmail.com");
        Map<String, String> cardCredentials = Map.of("cardNumber", "1234567890", "cvv", "123", "expiry", "01/23");

        Payment paypalPayment = PaymentFactory.createPayment("paypal", 100.0, paypalCredentials);
        paypalPayment.pay();

        Payment cardPayment = PaymentFactory.createPayment("card", 200.0, cardCredentials);
        cardPayment.pay();


    }

}
