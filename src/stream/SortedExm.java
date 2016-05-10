package stream;

import java.util.Random;

/**
 * Created by boki on 5/10/16.
 */
public class SortedExm {
    public static void main(String args[]){
        Random random = new Random();
        // ‘sorted’ method is used to sort the stream (desc)
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}
