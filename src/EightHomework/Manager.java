package EightHomework;

public class Manager extends Employee{
    int numberOfSubordinates;
    int getPercentForEachSubordinate(){
        return 3;
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }
    @Override
    public double getSalary(){
           return getBaseSalary() + (getBaseSalary()*numberOfSubordinates*getPercentForEachSubordinate()/100);
    }
}
