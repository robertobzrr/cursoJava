package exercicios.ex_sec06;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double horaI, horaF;

        System.out.println("==== Cálculo de horas jogadas ====");
        System.out.print("Digite a hora que você começou: ");
        horaI = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a hora que você terminou: ");
        horaF = sc.nextDouble();
        sc.nextLine();

        double duracao;
        if (horaI < horaF){
            duracao = horaF - horaI;
        } else {
            duracao = 24 - horaI + horaF;
        }

        System.out.printf("O jogo durou: %.2f Hora(s)", duracao);

        sc.close();
    }
}
