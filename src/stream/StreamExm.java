package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by boki on 5/10/16.
 */
public class StreamExm {
    public static void main(String args[]){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        // stream() − Returns a sequential stream considering collection as its source
        // filter : exclude data which is unsatisfied with condition from stream
        // collect :
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        filtered.forEach(string -> System.out.println(string));
    }
}
