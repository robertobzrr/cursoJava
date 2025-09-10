package exercicios.ex_sec06.ex_ifelse;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Vamos mexer com plano cartesiano");
        System.out.println("Escolha os valores de X e Y ");
        System.out.print("X = ");
        x = sc.nextDouble();
        sc.nextLine();
        System.out.print("Y = ");
        y = sc.nextDouble();
        sc.nextLine();

        System.out.printf("VOcê escolheu a coordenada: (%.1f, %.1f)%n%n", x,y);


        System.out.println("Agora vamos considerar o plano cartesiado");

        if (x > 0 && y > 0){
            System.out.println("Você está no quadrante Q1");
        }else if (x>0 && y<0){
            System.out.println("Você está no quadrante Q4");
        }else if (x<0 && y>0){
            System.out.println("Você está no quadrante Q2");
        }else if (x<0 && y<0){
            System.out.println("Você está no quadrante Q3");
        }else {
            System.out.println("você está na Origem (0,0)");
        }


        sc.close();
    }
}
