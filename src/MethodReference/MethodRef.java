package MethodReference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boki on 2016/5/5.
 */
public class MethodRef {
    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        /*
        Method references help to point to methods by their names.
        A method reference is described using :: (double colon) symbol.
        */

        names.forEach(System.out::println);
    }
}
