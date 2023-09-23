package EightHomework;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.name = "Milana";
        w1.getName();
        w1.setBaseSalary(100);
        System.out.println("Worker salary is "+ w1.getSalary());
        Manager m1 = new Manager();
        m1.setBaseSalary(1000);
        m1.setNumberOfSubordinates(2);
        System.out.println(m1.getSalary());

        Director d1 = new Director();
        d1.setBaseSalary(1000);
        d1.setNumberOfSubordinates(2);
        System.out.println(d1.getSalary());
        Worker[] arr = new Worker[10];
        EmployeeUtils util = new EmployeeUtils();
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Worker();
            arr[i].setBaseSalary(random.nextDouble());
        }
        System.out.println(util.countSalary(arr));
    }
}
