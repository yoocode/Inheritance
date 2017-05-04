package yoo.byung_chun.class_manager;

import java.util.ArrayList;

/**
 * Created by byung-chunyoo on 5/4/17.
 */
public class Product  {

    private String name;
    private int value;
    private int id;
    private int quantity;

    public Product(String name, int value, int id, int quantity) {

        this.name = name;
        this.value = value;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int returnProductValue(){

        return getQuantity() * getValue();
    }
}
