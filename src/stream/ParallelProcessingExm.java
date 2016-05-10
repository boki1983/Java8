package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by boki on 5/10/16.
 */
public class ParallelProcessingExm {
    public static void main(String args[]){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //get count of empty string
        /*
          parallelStream is the alternative of stream for parallel processing
          Use sequential streams by default and only consider parallel ones if
          1. have a massive amount of items to process
          2. have a performance problem in the first place
          3. don't already run the process in a multi-thread environment
        */
        long cnt = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(cnt);
    }
}
