package exercicios.ex_sec06.ex_while;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o que deseja abastecer:\n1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - Sair");
        int tipo = sc.nextInt();
        sc.nextLine();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += + 1;
            }
            else if (tipo == 2) {
                gasolina += + 1;
            }
            else if (tipo == 3) {
                diesel += + 1;
            }

            System.out.println("Digite o que deseja abastecer:\n1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - Sair");
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO\nSumário de vendas:\n");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
