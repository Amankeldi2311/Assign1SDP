package payments;

public class Payment implements IPayable {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void pay() {
        
    }
}
