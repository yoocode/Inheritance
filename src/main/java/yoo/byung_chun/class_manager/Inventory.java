package yoo.byung_chun.class_manager;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by byung-chunyoo on 5/4/17.
 */
public class Inventory {

    ArrayList<Product> productList;

    public Inventory(){
        productList = new ArrayList<Product>();
    }

    public int getTotalValueOfInventory(){

        int sum = 0;

        for(Product p : productList ){
            sum+= p.returnProductValue();
        }

        return sum;
    }

    public void add(Product p){
        productList.add(p);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Product p: productList){
            sb.append("Name: " + p.getName() + ", Id: " + p.getId() + ", Value: " + p.getValue() +
                    ", Quantity: " + p.getQuantity());
            sb.append (" \n");
        }
        return sb.toString();
    }


}
