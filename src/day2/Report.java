package day2;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report  со статическим методом generateReport, в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматирование строк. Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 */
public class Report {

    public static void main(String[] args) {
        Employee alex = new Employee("Alex", 20000.0);
        Employee stas = new Employee("Stas", 25000.0);
        Employee[] employees = {alex, stas};
        generateReport(employees);
    }
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет: ");
        for (Employee employee : employees) {
            System.out.printf("%s | %20.2f\n", employee.getFullName(), employee.getSalary());
        }
    }
}
