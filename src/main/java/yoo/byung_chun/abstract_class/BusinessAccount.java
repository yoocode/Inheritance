package yoo.byung_chun.abstract_class;

/**
 * Created by byung-chunyoo on 5/4/17.
 */
public class BusinessAccount extends Account {
    public BusinessAccount(double currentBalance, double interestRate) {
        super(currentBalance, interestRate);
    }

    public double calculateEarning(double currentBalance, double interestRate){
        return currentBalance * interestRate / 100;
    }
}
