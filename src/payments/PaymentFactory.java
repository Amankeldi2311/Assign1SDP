package payments;

public class PaymentFactory {
    public static Payment createPayment(String type, double amount, String... credentials) {
        switch (type) {
            case "Card":
                return new CardPayment(amount, credentials[0], credentials[1], credentials[2]);
            case "PayPal":
                return new PayPalPayment(amount, credentials[0]);
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
