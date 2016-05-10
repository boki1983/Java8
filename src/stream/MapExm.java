package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by boki on 5/10/16.
 */
public class MapExm {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //‘map’ method is used to map each element to its corresponding result
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);
    }
}
