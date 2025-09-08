package exercicios.ex_sec04;
import java.util.Scanner;


public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, dif, novoCalc;

        do {

            System.out.println("====== Calculando a diferença ======");
            System.out.println("Considerando as variáveis A, B, C, D. Atribua um valor para cada.");

            System.out.print("A = ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.print("B = ");
            b = sc.nextInt();
            sc.nextLine();
            System.out.print("C = ");
            c = sc.nextInt();
            sc.nextLine();
            System.out.print("D = ");
            d = sc.nextInt();
            sc.nextLine();

            System.out.println("Resultado da diferença do produto entre A*B e C*D");
            dif = (a*b)-(c*d);
            System.out.printf("DIFERENÇA = %d%n%n", dif);

            System.out.printf("Deseja fazer um novo cálculo?%n[1] Sim%n[0] Não%n");
            novoCalc = sc.nextInt();
            sc.nextLine();

        }while(novoCalc == 1);
        System.out.println("Programa finalizado!");
        sc.close();

    }
}
