package yoo.byung_chun.class_manager;

import org.junit.Test;

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
        assertEquals(actualProductValue, expectedProductValue);



    }
}
