package exercicios.ex_sec06.ex_while;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.print("Password: ");
        senha = sc.nextInt();
        sc.nextLine();

        while (senha != 2002) {
            System.out.println("Senha Inválida.\nTente novamente");
            System.out.print("Password: ");
            senha = sc.nextInt();

        }

        System.out.println("Bem-Vindo!");




    }
}
