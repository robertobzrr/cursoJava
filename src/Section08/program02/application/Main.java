package Section08.program02.application;
import Section08.program02.entities.Quadrado;
import Section08.program02.entities.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();


        System.out.println("Vamos calcular a área de um quadrado e de um triângulo.");
        System.out.println("entre os valores: ");
        System.out.println("1. Quadrado");
        System.out.print("Base: ");
        q.base = input.nextDouble();
        input.nextLine();
        System.out.println("2. Triângulo");
        System.out.print("Base: ");
        t.base = input.nextDouble();
        input.nextLine();
        System.out.print("Altura: ");
        t.altura = input.nextDouble();
        input.nextLine();

        System.out.println("======= Resultado =======");
        System.out.printf("Área do Quadrado: %.2f%nÁrea do Triângulo: %.2f", q.areaQuadrado(), t.areaTriangulo());


        input.close();
    }
}
