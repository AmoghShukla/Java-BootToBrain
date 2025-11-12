import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        int presetPIN = 1234;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your PIN: ");
        int newPIN = sc.nextInt();

        if (presetPIN == newPIN){
            System.out.println("Correct Pin Entered");
        } else {
            System.out.println("Wrong Pin, Access Denied");
        }
    }
    
}
