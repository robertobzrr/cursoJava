package exercicios.ex_sec06.ex_ifelse;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.println("Digite um valor: ");
        valor = sc.nextDouble();
        sc.nextLine();

        if (valor > 0 && valor < 25){
            System.out.println("Valor no intervalo de [0, 25]");
        }else if (valor > 25 && valor < 50){
            System.out.println("Valor no intervalo de [25, 50]");
        }else if (valor > 50 && valor < 75){
            System.out.println("Valor no intervalo de [50, 75]");
        }else if (valor > 75 && valor < 100){
            System.out.println("Valor no intervalo de [75, 100]");
        }else {
            System.out.println("Valor fora dos intervalos sugeridos.");
        }


        sc.close();
    }
}
