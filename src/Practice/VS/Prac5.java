package Practice.VS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary)
    {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    public double getSalary()
    {
        return salary;
    }
}

public class Prac5
{



    public static void main(String[] args) {
        List<Employee> employeesList = Arrays.asList(
                new Employee(1, "Alex", 100),
                new Employee(2, "Brian", 100),
                new Employee(3, "Charles", 200),
                new Employee(4, "David", 200),
                new Employee(5, "Edward", 300),
                new Employee(6, "Frank", 300)
        );
        List<Double> distinctSalaries = employeesList.stream()
                .map(Employee::getSalary)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctSalaries);
    }

}
