package exercicios.ex_sec08.ex02.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double taxSalary;
    public double finalSalary;

    public double netSalary(){
        return finalSalary = grossSalary-taxSalary;
    }

    public void increaseSalary(double bonus){
        this.finalSalary += finalSalary*(bonus/100);
    }

}
