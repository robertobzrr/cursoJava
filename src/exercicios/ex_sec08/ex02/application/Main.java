package exercicios.ex_sec08.ex02.application;
import exercicios.ex_sec08.ex02.entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Digite os dados do funcionário.");

        System.out.print("Nome: ");
        employee.name = input.nextLine();

        System.out.print("Salário Bruto: ");
        employee.grossSalary = input.nextDouble();
        input.nextLine();

        System.out.print("Taxa de Salário: ");
        employee.taxSalary = input.nextDouble();
        input.nextLine();


        System.out.println("========== Tabela do Funcionário ==========");
        System.out.printf("Nome: %s%nSalário Bruto: %.2f%nTaxa Salarial: %.2f%n", employee.name, employee.grossSalary, employee.taxSalary);
        System.out.printf("O Funcionário %s recebe um salário líquido de R$%.2f%n", employee.name, employee.netSalary());
        System.out.printf("%nDeseja dar um bonus para %s de quantos %% = ", employee.name);
        double bonus = input.nextDouble();
        input.nextLine();
        employee.increaseSalary(bonus);

        System.out.printf("%s recebera um bonus de %.0f%%%n", employee.name, bonus);
        System.out.printf("Salário final esse mês: %.0f%n", employee.finalSalary);





        input.close();
    }
}
