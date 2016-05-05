package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by boki on 2016/5/5.
 */
public class ReferenceToConstructor {
    public static void main(String[] args) {
        List numbers = Arrays.asList(4,9,16,25,36);
        List squaredNumbers = ReferenceToConstructor.findSquareRoot(numbers,Double::new);
        System.out.println("Square root of numbers = "+squaredNumbers);
    }

    private static List findSquareRoot(List list, Function<Double,Double > f){
        List result = new ArrayList();
        list.forEach(x -> result.add(f.apply(Math.sqrt((int)x))));
        return result;
    }
}
