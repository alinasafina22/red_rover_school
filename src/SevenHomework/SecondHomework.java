package SevenHomework;

//Задача №2
//  Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
//Класс должен иметь метод isSameName(Employee employee) который возвращает true,
//если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.


public class SecondHomework {
    public static void main(String[] args) {
        Employee kim = new Employee();
        Employee kendall = new Employee();
        kim.name = "Kim";
        kendall.name = "Kendall";
        System.out.println(kendall.isSameName(kim));

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


