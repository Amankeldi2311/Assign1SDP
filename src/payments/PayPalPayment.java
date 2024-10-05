package payments;

import java.util.Map;

public class PayPalPayment extends Payment {


    public PayPalPayment(double amount, Map<String, String> credentials) {
        super(amount, credentials);
    }

    @Override
    public void pay() {
        System.out.println("PayPal payment of " + amount + " made with email " + credentials.get("email"));
    }
}
