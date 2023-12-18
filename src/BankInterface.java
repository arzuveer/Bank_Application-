public interface BankInterface {
    int getBalance();
    String depositeMoney(int amt);
    String withdraw(int amt,String password);
    double calculateInterest(int time);
    boolean confirmPassword(String password);
    boolean isStrongpassword(String password);
}
