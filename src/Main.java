import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SBI :) LET'S CREATE YOUR ACCOUNT !!!! ");
        System.out.println("ENTER NAME: ");
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
        System.out.println("ENTER INITIAL BALANCE: ");
        int balance= sc.nextInt();
        System.out.println("NOW CREAT A STRONG PASSWORD WITH ATLEAST ONE UPPERCASE,ONE LOWERCASE,ONE SPECIAL SYMBOL AND IT MUST BE OF SIZE 8: ");
        String password= sc.next();
        SBIAccount s1= new SBIAccount(name,password,balance);
        boolean b= s1.isStrongpassword(password);
        if(b) {
            System.out.println("RE-ENTER PASSWORD: ");
            String pass2 = sc.next();
            if (s1.confirmPassword(pass2)) {
                System.out.println("YOUR ACCOUNT CREATED WITH ACCOUNT NO: " + s1.getAcc_no());
                System.out.println("CURRENT BALANCE: " + s1.getBalance());
                System.out.println("ENTER AMOUNT TO BE DEPOSITED!! ");
                int amount = sc.nextInt();
                System.out.println(s1.depositeMoney(amount));
                System.out.println("ENTER TIME FOR INTEREST: ");
                int time = sc.nextInt();
                System.out.println("TOTAL INTEREST: " + s1.calculateInterest(time));
                System.out.println("ENTER AMOUNT TO BE DEDUCTED: ");
                int w_amt = sc.nextInt();
                System.out.println("ENTER YOUR PASSWORD: ");
                String pass = sc.next();
                System.out.println(s1.withdraw(w_amt, pass));
            } else {
                System.out.println("PASSWORD NOT MATCHED!!! ACCOUNT NOT CREATED!!!");
            }
        }
        else {
            System.out.println("PASSWORD IS WEAK :(");
        }


    }
}