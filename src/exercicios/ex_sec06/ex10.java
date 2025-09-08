package exercicios.ex_sec06;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();
        sc.nextLine();

        while (x != 0 && y != 0){

            if (x > 0 && y > 0){
                System.out.println("Você está no quadrante Q1");
            }else if (x>0 && y<0){
                System.out.println("Você está no quadrante Q4");
            }else if (x<0 && y>0){
                System.out.println("Você está no quadrante Q2");
            }else if (x<0 && y<0){
                System.out.println("Você está no quadrante Q3");
            }

            System.out.print("Digite um novo valor para X: ");
            x = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite um novo valor para Y: ");
            y = sc.nextInt();
            sc.nextLine();


        }

        System.out.println("\nCoordenada NULA inválida\nPrograma Finalizado!");

        sc.close();
    }
}
