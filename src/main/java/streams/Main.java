package streams;

import streams.domain.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private static List<Employee> employeeList;

    public static void main(String[] args) {
        employeeList = Util.getTestEmployeeList();
        method1();
        method2();
    }

    public static void method1() {
        System.out.println("Print each employee");
        employeeList.stream().forEach(System.out::println);
        System.out.println("------------------------------");
    }

    public static void method2() {
        System.out.println("Get Count By Department");
        Map<String, Long> departmentMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(departmentMap);
        System.out.println("------------------------------");
    }

}

