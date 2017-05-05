package yoo.byung_chun.class_manager;

import java.util.ArrayList;

/**
 * Created by byung-chunyoo on 5/4/17.
 */
public class Inventory extends ArrayList<Product> {


    Inventory inventory = new Inventory();

    public int getTotalValueOfInventory(){

        int sum = 0;

        for(Product p : this ){
            sum+= p.returnProductValue();
        }

        return sum;
    }
}
