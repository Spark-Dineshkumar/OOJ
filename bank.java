import java.util.Scanner;

class Account {
    String customerName;
    long accountNumber;
    String accountType;
    double balance;

     Account(String customerName, long accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class SavAcct extends Account {
    double interestRate;

    public SavAcct(String customerName, long accountNumber, double balance, double interestRate) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = interestRate;
    }

    public void computeInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest of $" + interest + " computed and deposited.");
    }

   
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class CurrAcct extends Account {
    double minBalance;
    double serviceCharge;

    public CurrAcct(String customerName, long accountNumber, double balance, double minBalance, double serviceCharge) {
        super(customerName, accountNumber, "Current", balance);
        this.minBalance = minBalance;
        this.serviceCharge = serviceCharge;
    }

    
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance not maintained. Service charge of $" + serviceCharge + " imposed.");
            balance -= serviceCharge;
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        SavAcct savingsAccount = new SavAcct("John Doe", 123456789, 1000.0, 5.0);
        savingsAccount.displayBalance();
        savingsAccount.deposit(500.0);
        savingsAccount.computeInterest();
        savingsAccount.withdraw(200.0);
        savingsAccount.displayBalance();

        CurrAcct currentAccount = new CurrAcct("Jane Doe", 987654321, 1500.0, 1000.0, 20.0);
        currentAccount.displayBalance();
        currentAccount.deposit(300.0);
        currentAccount.withdraw(700.0);
        currentAccount.displayBalance();

        scanner.close();
    }
}