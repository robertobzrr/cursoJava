package exercicios.ex_sec04;
import java.util.Scanner;


public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        int novoCalc;
        do {
            System.out.println("====== Cálculo da área de um círculo ======");
            System.out.print("Digite o valor do raio: ");
            raio = sc.nextDouble();
            sc.nextLine();

            area = pi * raio*raio;
            System.out.printf("A área é: %.4f", area);

            System.out.printf("%n%nDeseja calcular outro raio?%n[1] Sim%n[0] Não%n");
            novoCalc = sc.nextInt();
            sc.nextLine();

        }while(novoCalc == 1);
        System.out.print("Programa finalizado!");
        sc.close();


    }
}
