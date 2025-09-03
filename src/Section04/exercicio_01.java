package Section04;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, soma;
        int novaSoma = 1;

        do {
            System.out.println("===== Soma de valores =====");

            System.out.print("Digite o valor de x: ");
            x = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o valor de y: ");
            y = sc.nextInt();
            sc.nextLine();

            soma = x + y;
            System.out.printf("A soma de %d + %d = %d", x, y, soma);

            System.out.printf("%n%nDeseja fazer uma nova soma?%n[1] Sim%n[0] Não%n");
            novaSoma = sc.nextInt();
            sc.nextLine();


        }while(novaSoma == 1);
        System.out.println("Programa finalizado!");

        sc.close();

    }
}
