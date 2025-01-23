abstract class Payment {
    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPalPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        payment1.processPayment();
        payment2.processPayment();
    }
}
