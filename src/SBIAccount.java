import java.util.UUID;

public class SBIAccount implements BankInterface {
    private String acc_no;
    private String name;
    private String password;
    private int balance;
    private double rate;

    public SBIAccount(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.rate=6.6;
        this.acc_no= String.valueOf(UUID.randomUUID());
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositeMoney(int amt) {
        this.balance += amt;
        return "AMOUNT ADDED SUCESSFULLY :) "+"CURRENT BALANCE: "+this.balance;
    }

    @Override
    public String withdraw(int amt,String Epassword) {
        if(Epassword.equals(this.password))
        {
            if(balance < amt)
            {
                return "INSUFFICIENT BALANCE :( "+"CURRENT BALANCE: "+this.balance;
            }
            else {
                this.balance -= amt;
                return "AMOUNT WITHDRAW SUCESSFULLY!!! " +"AMOUNT LEFT: "+ this.balance;
            }
        }
        else
            return "WRONG PASSWORD :(";
    }


    @Override
    public double calculateInterest(int time) {
        return ((balance*rate*time)/100.0);
    }

    @Override
    public boolean confirmPassword(String password) {
        if(password.equals(this.password))
          return true;
        else
            return false;
    }

    @Override
    public boolean isStrongpassword(String password) {
        int size= password.length();
        boolean f=false;
        int c1=0,c2=0,c3=0;
        if(size < 8) {
            System.out.println("IT MUST CONTAIN ATLEAST 8 CHARACTERS :(");
            return f;
        }
        else{
            for (int a = 0; a < size; a++) {
                if (password.charAt(a) >= 'A' && password.charAt(a) <= 'Z')
                    c1++;
            }
            for(int a=0; a<size; a++)
            {
                if(password.charAt(a) >= 'a' && password.charAt(a)<= 'z' )
                    c2++;
            }
            for(int a=0; a<size; a++)
            {
                if(password.charAt(a) >= 33 && password.charAt(a)<=47 ||password.charAt(a)==64 )
                    c3++;
            }
            if(c3>0) {
                if (c1 > 0) {
                    if (c2 > 0) {
                        System.out.println("STRONG PASSWORD :)");
                        f = true;
                    } else
                        System.out.println("NO LOWER CASE FOUND :(");
                } else
                    System.out.println("NO UPPER CASE FOUND :(");
            }
            else
                System.out.println("NO SYMBOL FOUND :(");
        }
        return f;
    }
}
