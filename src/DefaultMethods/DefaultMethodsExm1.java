package DefaultMethods;

/**
 * Created by boki on 2016/5/8.
 * This capability is added for backward compatibility
 * so that old interfaces can be used to leverage the lambda expression capability of Java 8.
 */
public class DefaultMethodsExm1 {
    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

interface Vehicle {
    // default method
    default void print(){
        System.out.println("I am a vehicle!");
    }

    static void blowHorn(){
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {
    default void print(){
        System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler {
    public void print(){
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}
