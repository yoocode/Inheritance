package yoo.byung_chun.abstract_class;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by byung-chunyoo on 5/4/17.
 */
public class testAccount {

    @Test

    public void testCalculateEarningForChecking(){
        //Given
        double currentBalance = 3000;
        double interestRate = 2;
        double expectedEarnings = currentBalance * interestRate / 100;

        CheckingAccount checkingAccount = new CheckingAccount (currentBalance, interestRate);

        //When
        double actualEarnings = checkingAccount.calculateEarning(currentBalance, interestRate);

        //Then
        Assert.assertEquals(expectedEarnings, actualEarnings, 0);
    }

    @Test

    public void testCalculateEarningForSaving(){
        //Given
        double currentBalance = 1000;
        double interestRate = 2;
        double expectedEarnings = currentBalance * interestRate / 100;

        SavingAccount savingAccount = new SavingAccount(currentBalance, interestRate);

        //When
        double actualEarnings = savingAccount.calculateEarning(currentBalance, interestRate);

        //Then
        Assert.assertEquals(expectedEarnings, actualEarnings, 0);
    }
    public void testCalculateEarningForBusiness(){
        //Given
        double currentBalance = 1000;
        double interestRate = 2;
        double expectedEarnings = currentBalance * interestRate / 100;

        BusinessAccount businessAccount = new BusinessAccount(currentBalance, interestRate);

        //When
        double actualEarnings = businessAccount.calculateEarning(currentBalance, interestRate);

        //Then
        Assert.assertEquals(expectedEarnings, actualEarnings, 0);
    }
}
