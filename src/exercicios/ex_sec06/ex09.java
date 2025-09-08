package exercicios.ex_sec06;
import java.util.Scanner;

public class ex09 {
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
