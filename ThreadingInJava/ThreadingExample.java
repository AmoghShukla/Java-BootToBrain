package ThreadingInJava;
import java.util.Scanner;

class Account{
    private int bal;
    public Account(int bal){
        this.bal=bal;
    }
    public boolean hasSufficientBalance(int amt){
        if(amt < bal){
            return(true);
        } else {
            return(false);
        }
    }
    public void withdraw(int amt){
        if (hasSufficientBalance(amt)){
            bal = bal - amt;
            System.out.println("Withdrawn: " + amt);
            System.out.println("Remaining Balance: " + bal);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

}

class Customer implements Runnable{
    private Account acc;
    public Customer(Account acc){
        this.acc = acc;
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        int amt = sc.nextInt();
        acc.withdraw(amt);
    }

}


public class ThreadingExample {
    public static void main(String[] args){
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1);
        Thread t1 = new Thread(c1);
        Customer c2 = new Customer(a1);
        Thread t2 = new Thread(c2);

        
    }
    
}
