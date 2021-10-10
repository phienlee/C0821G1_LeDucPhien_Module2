package review_oop.ex_2;

public class PhienBank {
    private long accountNumber;
    private String accountName;
    private double accountBalance;
    private static final float RATE = 0.035f;
    private static final int FEE_TRANSFER = 7000;

    public PhienBank(long accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public PhienBank() {

    }

    public PhienBank(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = 50000;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double payAccount(double money) {
        return accountBalance += money;
    }

    public double  withdrawalFromAccount (double moneyWithdrawal){
        return accountBalance -= moneyWithdrawal;
    }

    public void getExpired(){
         this.accountBalance = this.accountBalance + this.accountBalance * RATE;
    }

    public void transferToOther(PhienBank bankAccount, double moneyTransfer) {
        bankAccount.accountBalance = bankAccount.accountBalance + moneyTransfer;
        this.accountBalance = this.accountBalance - moneyTransfer - FEE_TRANSFER;
    }
    @Override
    public String toString() {
        return "PhienBank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
