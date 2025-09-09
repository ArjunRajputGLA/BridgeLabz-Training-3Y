public class BankAccount {
    String holder;
    String accNo;
    double balance;

    BankAccount(String holder, String accNo, double balance) {
        this.holder = holder;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Lynda", "123456789", 700);
        b.showBalance();
        b.deposit(200);
        b.showBalance();
        b.withdraw(100);
        b.showBalance();
        b.withdraw(900);
    }
}
