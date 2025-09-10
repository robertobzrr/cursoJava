package exercicios.ex_sec06.ex_ifelse;
import java.util.Scanner;


public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite um valor inteiro: ");
        x = sc.nextInt();
        sc.nextLine();

        if (x > 0){
            System.out.println("POSITIVO");
        }else if (x == 0) {
            System.out.println("NEUTRO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
