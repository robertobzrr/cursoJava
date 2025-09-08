package exercicios.ex_sec06;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.println("====== Calculadora de Imposto de Renda ======");
        System.out.print("Digite seu salário: ");
        salario = sc.nextDouble();
        sc.nextLine();

        if (salario <= 2000){
            System.out.println("ISENTO");
        }else if (salario > 2000 && salario <= 3000){
            System.out.println("Você pagará 8% de impostos");
            imposto = salario * 0.08;
            System.out.printf("Imposto = R$%.2f", imposto);
        }else if (salario > 3000 && salario <= 4500){
            System.out.println("Você pagará 18% de impostos");
            imposto = salario *0.15;
            System.out.printf("Imposto = R$%.2f", imposto);
        }else if (salario > 4500){
            System.out.println("Você pagará 28% de impostos");
            imposto = salario *0.28;
            System.out.printf("Imposto = R$%.2f", imposto);
        }


        sc.close();
    }
}
