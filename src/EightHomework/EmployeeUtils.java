package EightHomework;

public class EmployeeUtils {

    public Employee findByName(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if (e.getName() == name) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee findBySubname(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if (e.getName().contains(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public double countSalary(Employee[] employees) {
        double total_budget = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            total_budget += e.getSalary();
        }
        return total_budget;
    }

    public double minSalary(Employee[] employees){
        double min = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++){
            if (employees[i].getSalary()<min){
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public double maxSalary(Employee[] employees){
        double max = 0;
        for (int i = 1; i < employees.length; i++){
            if (employees[i].getSalary()>max){
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public int minNumberOfSubordinates(Manager[] managers){
        int min = managers[0].getNumberOfSubordinates();
        for (int i = 1; i< managers.length;i++){
            if (managers[i].getNumberOfSubordinates() < min){
                min = managers[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public int maxNumberOfSubordinates(Manager[] managers){
        int max = managers[0].getNumberOfSubordinates();
        for (int i = 1; i< managers.length;i++){
            if (managers[i].getNumberOfSubordinates() > max){
                max = managers[i].getNumberOfSubordinates();
            }
        }
        return max;
    }
    public double maxDifference(Manager[] managers){
        double max = 0;
        for (int i = 1; i< managers.length;i++){
            if (managers[i].getSalary()-managers[i].getBaseSalary() > max){
                max = managers[i].getSalary()-managers[i].getBaseSalary();
            }
        }
        return max;
    }
    public double minDifference(Manager[] managers){
        double min = Double.MAX_VALUE;
        for (int i = 1; i< managers.length;i++){
            if (managers[i].getSalary()-managers[i].getBaseSalary() < min){
                min = managers[i].getSalary()-managers[i].getBaseSalary();
            }
        }
        return min;
    }
}
