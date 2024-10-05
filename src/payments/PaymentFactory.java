package payments;

import java.util.Map;

public class PaymentFactory {
    public static Payment createPayment(String type, double amount, Map<String, String> credentials) {
      switch (type) {
        case "paypal":
          return new PayPalPayment(amount, credentials);
        case "card":
            return new CardPayment(amount, credentials);
        default:
            return null;
      }
    }
}
