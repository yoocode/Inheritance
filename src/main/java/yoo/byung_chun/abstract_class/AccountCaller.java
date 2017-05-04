package yoo.byung_chun.abstract_class;

/**
 * Created by byung-chunyoo on 5/4/17.
 */
public class AccountCaller {
    public static void main (String [] args){

        CheckingAccount checkingAccount = new CheckingAccount (3000.00, 5);

        SavingAccount savingAccount = new SavingAccount(10000, 10);

        BusinessAccount businessAccount = new BusinessAccount(50000, 2);



    }

}
