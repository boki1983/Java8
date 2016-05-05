package LambdaExpressions;

/**
 * Created by boki on 2016/5/5.
 */
public class LambdaScope {
    final static String salutation = "Hello!";

    public static void main(String args[]){
        GreetingService greetService1 = message -> System.out.println(salutation + message);
        greetService1.sayMessage("boki");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
