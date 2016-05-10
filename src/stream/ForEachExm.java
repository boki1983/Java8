package stream;

import java.util.Random;

/**
 * Created by boki on 5/10/16.
 */
public class ForEachExm {
    public static void main(String args[]){
        Random random = new Random();
        // ‘forEach’ to iterate each element of the stream
        //  ‘limit’ method is used to reduce the size of the stream.
        random.ints().limit(10).forEach(System.out::println);
    }
}
