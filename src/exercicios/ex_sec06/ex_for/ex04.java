package exercicios.ex_sec06.ex_for;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Vamos fazer divisões!!\nEscolha quantas divisões deseja fazer. ");
        System.out.print("Digite a quantiade: ");
        int n =  input.nextInt();
        input.nextLine();

        for (int i=0; i<n; i++) {
            System.out.print("Dividendo: ");
            double a = input.nextDouble();
            input.nextLine();

            System.out.printf("Divisor: ");
            double b = input.nextDouble();
            input.nextLine();

            if(b!=0) {
                double divisao = a / b;
                System.out.printf("Resultado de %.1f/%.1f = %.1f%n", a, b, divisao);
            }else{
                System.out.println("divisao invalida");
            }
        }


        input.close();
    }
}
