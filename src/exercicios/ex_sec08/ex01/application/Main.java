package exercicios.ex_sec08.ex01.application;
import exercicios.ex_sec08.ex01.entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();


        System.out.println("Digite os valores para a Base e Altura do retangulo.");
        System.out.print("Base: ");
        rectangle.width = input.nextDouble();
        input.nextLine();

        System.out.print("Altura: ");
        rectangle.height = input.nextDouble();
        input.nextLine();

        System.out.println("======= Resultado =======");
        System.out.printf("Área: %.2f%nPerimetro: %.2f%nDiagonal: %.2f%n", rectangle.areaRectangle(), rectangle.perimeterRectangle(), rectangle.diagonalRectangle());

        input.close();
    }
}
