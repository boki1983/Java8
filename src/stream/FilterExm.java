package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by boki on 5/10/16.
 */
public class FilterExm {
    public static void main(String args[]){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //get count of empty string
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.print(count);
    }
}
