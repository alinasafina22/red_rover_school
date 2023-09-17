package SevenHomework;

//Задача №2
//  Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
//Класс должен иметь метод isSameName(Employee employee) который возвращает true,
//если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.


public class SecondHomework {
    public static void main(String[] args) {
        Employee kim = new Employee();
        Employee kendall = new Employee();
        Employee[] array = new Employee[2];
        kim.name = "Kim";
        kendall.name = "Kendall";
        kim.salary = 100;
        kendall.salary = 350;
        array[0] = kim;
        array[1] = kendall;
        System.out.println(kendall.isSameName(kim));
        Salary salary = new Salary();
        System.out.println(salary.getSum(array));
    }
}


class Employee {
    int age;
    String name;
    String sex;
    int salary;

    boolean isSameName(Employee employee){
        return employee.name == name;
    }
}
class Salary {
    int getSum(Employee[] employeeArray){
        int sum = 0;
        for (Employee employee : employeeArray) {
            sum += employee.salary;
        }
        return sum;
    }

}

