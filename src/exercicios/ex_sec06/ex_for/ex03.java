package exercicios.ex_sec06.ex_for;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite quants vezes quer calcular uma média: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i=0; i<n; i++){

            System.out.print("Nota 1: ");
            double a = input.nextDouble();
            input.nextLine();

            System.out.print("Nota 2: ");
            double b = input.nextDouble();
            input.nextLine();

            System.out.print("Nota 3: ");
            double c = input.nextDouble();
            input.nextLine();

            double media = (a*2+b*3+c*5)/10;

            System.out.printf("Média = %.1f%n", media);

        }

        input.close();
    }
}
