package yoo.byung_chun.abstract_class;

/**
 * Created by byung-chunyoo on 5/3/17.
 */
public abstract class Account {

    private double currentBalance;
    private double interestRate;

    public Account(double currentBalance, double interestRate) {
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }



    public abstract double calculateEarning(double currentBalance, double interestRate);
}
