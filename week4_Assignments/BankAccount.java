class Account {
    private String accountNumber, ownerName;
    private double balance;
    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }
    public Account(String accountNumber, String ownerName, double openingBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (openingBalance >= 0) {
            this.balance = openingBalance;
        } else {
            this.balance = 0;
        }
    }
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return "Account{accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", balance=" + balance + "}";
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account a1 = new Account("101", "Astha");
        Account a2 = new Account("102", "Priya", 1000);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println( a1.deposit(500));
        System.out.println(a1);
        System.out.println(a1.deposit(0));
        System.out.println(a1);
        System.out.println(a1.deposit(-100));
        System.out.println(a1);
        System.out.println(a2.withdraw(300));
        System.out.println(a2);
        System.out.println(a2.withdraw(1000));
        System.out.println(a2);
    }
}
