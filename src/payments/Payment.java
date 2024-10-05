package payments;

import java.util.Map;

public abstract class Payment implements IPayable {
    protected double amount;
    protected Map<String, String> credentials;

    public Payment(double amount, Map<String, String> credentials) {
        this.amount = amount;
        this.credentials = credentials;
    }

}
