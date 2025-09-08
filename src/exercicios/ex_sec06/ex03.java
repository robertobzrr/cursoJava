package exercicios.ex_sec06;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite dois valores para as variáveis A e B:");
        System.out.print("A = ");
        A = sc.nextInt();
        sc.nextLine();
        System.out.print("B = ");
        B = sc.nextInt();
        sc.nextLine();


        if (A%B == 0 || B%A == 0){
            System.out.print("é multiplo");
        } else {
            System.out.print("não é multiplo");
        }


        sc.close();
    }
}
