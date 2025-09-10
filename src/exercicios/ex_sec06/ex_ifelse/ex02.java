package exercicios.ex_sec06.ex_ifelse;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();
        sc.nextLine();


        if ( x % 2 == 0 ){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }


        sc.close();

    }
}
