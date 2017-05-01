package yoo.byung_chun.rotate_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by byung-chunyoo on 5/1/17.
 */
public class RotateArray extends ArrayList  {
    public static void main (String[] args){

        //subclasse List class
        //creat an array
        //method to rotate by k element
        List myArray = new ArrayList();
        for (int i = 1; i<7; i++) {
            myArray.add(i);
        }

        Collections.rotate(myArray, 2);
        System.out.println(Arrays.toString(myArray.toArray()));












    }

}
