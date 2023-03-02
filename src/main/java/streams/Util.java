package streams;

import streams.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static final List<Employee> getTestEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John Doe", "john.doe@example.com", 50000, "Marketing"));
        employeeList.add(new Employee(2, "Jane Doe", "jane.doe@example.com", 60000, "Marketing"));
        employeeList.add(new Employee(3, "Bob Smith", "bob.smith@example.com", 55000, "Sales"));
        employeeList.add(new Employee(4, "Alice Johnson", "alice.johnson@example.com", 65000, "Sales"));
        employeeList.add(new Employee(5, "Jack Brown", "jack.brown@example.com", 70000, "IT"));
        employeeList.add(new Employee(6, "Mary Green", "mary.green@example.com", 45000, "IT"));
        employeeList.add(new Employee(7, "James Lee", "james.lee@example.com", 55000, "Marketing"));
        employeeList.add(new Employee(8, "Emily Wilson", "emily.wilson@example.com", 65000, "Sales"));
        employeeList.add(new Employee(9, "David Chen", "david.chen@example.com", 60000, "IT"));
        employeeList.add(new Employee(10, "Cathy Huang", "cathy.huang@example.com", 70000, "Marketing"));
        employeeList.add(new Employee(11, "Michael Kim", "michael.kim@example.com", 45000, "Sales"));
        employeeList.add(new Employee(12, "Karen Wong", "karen.wong@example.com", 55000, "IT"));
        employeeList.add(new Employee(13, "Tom Baker", "tom.baker@example.com", 65000, "Marketing"));
        employeeList.add(new Employee(14, "Amy Liu", "amy.liu@example.com", 60000, "Sales"));
        employeeList.add(new Employee(15, "Steven Davis", "steven.davis@example.com", 70000, "IT"));
        employeeList.add(new Employee(16, "Julie Chen", "julie.chen@example.com", 45000, "IT"));
        employeeList.add(new Employee(17, "Brian Johnson", "brian.johnson@example.com", 55000, "Marketing"));
        employeeList.add(new Employee(18, "Jessica Lee", "jessica.lee@example.com", 65000, "Sales"));
        employeeList.add(new Employee(19, "Kevin Huang", "kevin.huang@example.com", 60000, "IT"));
        employeeList.add(new Employee(20, "Sophia Kim", "sophia.kim@example.com", 70000, "Marketing"));
        employeeList.add(new Employee(21, "Eric Wong", "eric.wong@example.com", 45000, "Sales"));
        employeeList.add(new Employee(22, "Michelle Baker", "michelle.baker@example.com", 55000, "IT"));
        employeeList.add(new Employee(23, "William Davis", "william.davis@example.com", 65000, "Marketing"));
        employeeList.add(new Employee(24, "Grace Liu", "grace.liu@example.com", 60000, "Sales"));
        employeeList.add(new Employee(25, "Jonathan Chen", "jonathan.chen@example.com", 70000, "IT"));
        employeeList.add(new Employee(26, "Tina Huang", "tina.huang@example.com", 45000, "IT"));
        employeeList.add(new Employee(27, "Edward Lee", "edward.lee@example.com", 55000, "Marketing"));
        employeeList.add(new Employee(28, "Rachel Johnson", "rachel.johnson@example.com", 65000, "Sales"));

        return employeeList;
    }
}
