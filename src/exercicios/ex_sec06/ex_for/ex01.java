package exercicios.ex_sec06.ex_for;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Digite um número: ");
        x = input.nextInt();
        input.nextLine();

        for (int i=0; i<=x; i++) {
            if(i%2==1){
                System.out.println(i);
            }

        }

        input.close();
    }
}
