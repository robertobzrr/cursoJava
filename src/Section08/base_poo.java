package Section08;
import java.util.Scanner;

public class base_poo {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     Quadrado x = new Quadrado();

     System.out.println("Calcular a área de um quadrado");
     System.out.println("Digite os valores das suas bases.");

     System.out.print("Base A: ");
     x.baseA = input.nextInt();
     input.nextLine();

     System.out.print("Base B: ");
     x.baseB = input.nextInt();
     input.nextLine();


        System.out.println("Área = "+ x.area());

        input.close();
    }


    public static class Quadrado {

        public double baseA;
        public double baseB;

        public double area(){
            return baseA * baseB;

        }


    }


}
