package yoo.byung_chun.abstract_class;

/**
 * Created by byung-chunyoo on 5/3/17.
 */
public class CheckingAccount extends Account {

    public CheckingAccount(double currentBalance, double interestRate) {
        super(currentBalance, interestRate);
    }

    public double calculateEarning(double currentBalance, double interestRate){
        return currentBalance * interestRate / 100;
    }
}
