package payments;

public class PayPalPayment extends Payment{
    private String paymentToken;

    public PayPalPayment(double amount, String paymentToken) {
        super(amount);
        this.paymentToken = paymentToken;
    }

    @Override
    public void pay() {
        System.out.println("PayPal payment of " + amount + " made with payment token " + paymentToken);
    }

public String getPaymentToken() {
        return paymentToken;
    }
}
