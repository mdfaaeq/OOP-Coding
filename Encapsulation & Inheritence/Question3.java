class BankAccount{
    public String account_number;
    private float balance;
    public String getAccount_number() {
        return account_number;
    }
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative.");
            return;
        }
        this.balance = balance;
    }
    
    public BankAccount(String account_number, float balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative. Setting balance to 0.");
            balance = 0;
        }
        this.account_number = account_number;
        this.balance = balance;
    }
    
}

class SavingsAccount extends BankAccount{
    private float interest_rate;
    public SavingsAccount(String account_number, float balance, float interest_rate){
        super(account_number, balance);
        this.interest_rate = interest_rate;
    }
    public float getInterest_rate(){
        return interest_rate;
    }
}

public class Question3 {
    public static void main(String[] args) {
        // BankAccount account = new BankAccount("20231190", 3300.00f);
        // System.out.println("Account Number: " + account.getAccount_number());
        // System.out.println("Balance: " + account.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount("20231167", 23000.00f, 28.00f);
        System.out.println("Account Number: " + savingsAccount.getAccount_number() + " Balance: " + savingsAccount.getBalance() + " Interest Rate: " + savingsAccount.getInterest_rate());

    }
}

