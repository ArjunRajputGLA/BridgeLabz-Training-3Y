abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV123", "Rohit", 20000);
        BankAccount acc2 = new CurrentAccount("CUR456", "Amit", 50000);

        acc1.deposit(5000);
        acc1.withdraw(3000);
        System.out.println(acc1.getHolderName() + " Interest: " + acc1.calculateInterest());

        if (acc1 instanceof Loanable) {
            Loanable loan = (Loanable) acc1;
            loan.applyForLoan(100000);
            System.out.println("Eligible: " + loan.calculateLoanEligibility());
        }

        System.out.println(acc2.getHolderName() + " Interest: " + acc2.calculateInterest());
    }
}
