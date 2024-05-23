package java2.day4;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpDemo {
    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee("Ann", "delivery", BigDecimal.valueOf(100000.00)),
                new Employee("Ivan", "mf", BigDecimal.valueOf(200000.00)),
                new Employee("Alex", "delivery", BigDecimal.valueOf(100000.00)),
                new Employee("Kondrat", "rtc", BigDecimal.valueOf(150000.00)),
                new Employee("Ignat", "rtc", BigDecimal.valueOf(300000.00))
        };

        BigDecimal averageSalary = Arrays.stream(arrayOfEmps)
                .map(Employee::getSalary)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(arrayOfEmps.length));


        List<Employee> belowAverageSalaryEmployees = Arrays.stream(arrayOfEmps)
                .filter(emp -> emp.getSalary().compareTo(averageSalary) < 0)
                .toList();

        Map<String, Employee> maxSalaryByDepartment = Arrays.stream(arrayOfEmps)
                .collect(Collectors.toMap(Employee::getDepartment, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));
    }


}
