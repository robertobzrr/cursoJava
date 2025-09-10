package exercicios.ex_sec06.ex_for;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor de repetições: ");
        int n = input.nextInt();
        input.nextLine();

        int in = 0, out = 0;

        for (int i=0; i<n; i++) {
            System.out.print("Digite um valor: ");
            int x = input.nextInt();
            input.nextLine();

            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        input.close();
    }
}
