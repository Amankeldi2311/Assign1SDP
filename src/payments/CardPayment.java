package payments;

public class CardPayment extends Payment {
    private String cardNumber;
    private String expireDate;
    private String cvv;

    public CardPayment(double amount, String cardNumber, String expireDate, String cvv) {
        super(amount);
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }

    @Override
    public void pay() {
        System.out.println("Card payment of " + amount + " made with card number " + cardNumber);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getCvv() {
        return cvv;
    }
}


