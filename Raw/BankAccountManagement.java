import java.util.*;

class BankAccount {
    int accNo;
    String holder;
    int balance;

    BankAccount(int accNo, String holder, int balance) {
        this.accNo = accNo;
        this.holder = holder;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("After depositing " + amount + ":");
        System.out.println("Balance: " + balance);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("After withdrawing " + amount + ":");
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Withdrawal of " + amount + " failed. Insufficient balance!");
        }
    }

    void display() {
        System.out.println("Account Details:");
        System.out.println("Account No: " + accNo);
        System.out.println("Account Holder: " + holder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accNo = sc.nextInt();
        String holder = sc.next();
        int balance = sc.nextInt();
        BankAccount acc = new BankAccount(accNo, holder, balance);
        acc.display();
        int depositAmt = sc.nextInt();
        acc.deposit(depositAmt);
        int withdrawAmt1 = sc.nextInt();
        acc.withdraw(withdrawAmt1);
        int withdrawAmt2 = sc.nextInt();
        acc.withdraw(withdrawAmt2);
        System.out.println("Final Balance: " + acc.balance);
    }
}
