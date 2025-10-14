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



public class ThreadingExample {
    
}
