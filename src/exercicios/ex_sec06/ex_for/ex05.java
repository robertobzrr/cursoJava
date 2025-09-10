package exercicios.ex_sec06.ex_for;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int divisores = 0;

        System.out.print("Digite o valor de N: ");
        n = input.nextInt();
        input.nextLine();

        for (int i=1; i<=n; i++){

            if(n%i==0){
                System.out.println(i);;
            }

        }

        input.close();
    }
}
