public class HDFCAccount implements BankInterface {
    private int acc_no;
    private String name;
    private String password;
    private int balance;
    private double rate;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String depositeMoney(int amt) {
        return null;
    }

    @Override
    public String withdraw(int amt,String password) {
        return null;
    }

    @Override
    public double calculateInterest(int time) {
        return 0;
    }

    @Override
    public boolean confirmPassword(String password) {
        return true;
    }

    @Override
    public boolean isStrongpassword(String password) {
        return true;
    }
}
