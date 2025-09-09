// Demonstrating encapsulation with access modifiers

class BankAccount {
    public String accountNumber; // public
    protected String accountHolder; // protected
    private double bal; // private

    public BankAccount(String accountNumber, String accountHolder, double bal) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.bal = bal;
    }

    // public methods for bal
    public double getBalance() {
        return bal;
    }

    public void deposit(double amount) {
        bal += amount;
    }

    public void withdraw(double amount) {
        if (bal >= amount) {
            bal -= amount;
        } else {
            System.out.println("Insufficient bal!");
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double bal, double interestRate) {
        super(accountNumber, accountHolder, bal);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + " | Holder: " + accountHolder + " | bal: " + getBalance() + " | Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "Rahul", 20000, 5.5);
        sa.displayDetails();
        sa.deposit(5000);
        sa.withdraw(3000);
        sa.displayDetails();
    }
}
