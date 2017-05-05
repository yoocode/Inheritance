package yoo.byung_chun.class_manager;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

/**
 * Created by byung-chunyoo on 5/4/17.
 */
public class testClassManager {
    @Test

    public void testTotalValueOfInventory(){
        //Given
        Inventory products = new Inventory();

        products.add(new Product("Shampoo", 10, 1, 10));

        //When
        int actualProductValue = products.getTotalValueOfInventory();
        int expectedProductValue = 300;

        //Then
        Assert.assertEquals(actualProductValue, expectedProductValue);
    }

    @Test

    public void testReturnProductValue(){
        //Given
        int quantity = 10;
        int value = 5;
        int expectedReturnValue = quantity * value;//50
        Product product = new Product("Shampoo", 10, 1, 10);

        //When
        int actualReturnValue = product.returnProductValue();
        int actualProductValue = 100;

        //Then
        Assert.assertEquals(expectedReturnValue, actualReturnValue);
    }
}
