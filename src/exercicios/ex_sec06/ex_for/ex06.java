package exercicios.ex_sec06.ex_for;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i=1; i<=n; i++) {

            int iquadrado = i*i;
            int icubo = i*i*i;

            System.out.print(i+" ");
            System.out.print(iquadrado+" ");
            System.out.print(icubo+" \n");

        }


    }
}
