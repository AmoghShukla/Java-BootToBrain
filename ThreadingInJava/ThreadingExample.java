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
    public void withdraw(int amt, String name){
            bal = bal - amt;
            System.out.println("Hello " + name);
            System.out.println("Withdrawn: " + amt + " by " + name);
            System.out.println("Remaining Balance: " + bal);
    }

}

class Customer implements Runnable{
    private Account acc;
    private String name;
    public Customer(Account acc, String name){
        this.acc = acc;
        this.name = name;
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        synchronized(acc){
            System.out.println("Enter amount to withdraw: ");
            int amt = sc.nextInt();
            if(acc.hasSufficientBalance(amt)){
            System.out.println(name + " is withdrawing " + amt);
            acc.withdraw(amt, name);
            }
            else{
                System.out.println(name + "has Insufficient Balance");
            }
        }
    }

}


public class ThreadingExample {
    public static void main(String[] args){
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, "Amogh");
        Thread t1 = new Thread(c1);
        Customer c2 = new Customer(a1, "Sakshi");
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();


    }
    
}
