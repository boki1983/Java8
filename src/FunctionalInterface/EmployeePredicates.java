package FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by boki on 5/9/16.
 */
public class EmployeePredicates {
    public static Predicate<Employee> isAdultMale() {
        return employee -> employee.getAge() > 21 && "M".equalsIgnoreCase(employee.getGender());
    }

    public static Predicate<Employee> isAdultFemale() {
        return employee -> employee.getAge() > 18 && "F".equalsIgnoreCase(employee.getGender());
    }

    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return employee -> employee.getAge() > age;
    }

    /*this function will return a new collection of employees satisfying
    the condition mentioned in parameter predicate*/
    public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
    }
}
