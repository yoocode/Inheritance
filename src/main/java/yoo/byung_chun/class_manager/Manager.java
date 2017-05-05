package yoo.byung_chun.class_manager;

/**
 * Created by byung-chunyoo on 5/4/17.
 */
public class Manager {
    public static void main (String [] args){

       Inventory inventory = new Inventory();

       Product product = new Product("Apple", 2, 1, 100);
       Product product1 = new Product("Pear", 6, 2, 1000);
       Product product2 = new Product("Carrot", 1, 3, 50);

       inventory.add(product);
       inventory.add(product1);
       inventory.add(product2);

       System.out.println(inventory.getTotalValueOfInventory());
       System.out.println(inventory);





    }
}
