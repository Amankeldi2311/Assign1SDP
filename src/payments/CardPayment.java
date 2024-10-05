package payments;

import java.util.Map;

public class CardPayment extends Payment {


    public CardPayment(double amount, Map<String, String> credentials) {
        super(amount, credentials);
    }

    @Override
    public void pay() {
        System.out.println("Card payment of " + amount + " made with card number " + credentials.get("cardNumber") + " and expiry date " + credentials.get("expiryDate"));
    }
}


