package Section04;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, pi=3.14159, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        System.out.println("Digite valores para A, B e C que serão usados para calcular a área de um Triangulo, Circulo, Trapezio, Quadrado e Retangulo.");
        System.out.print("A = ");
        A = sc.nextDouble();
        sc.nextLine();
        System.out.print("B = ");
        B = sc.nextDouble();
        sc.nextLine();
        System.out.print("C = ");
        C = sc.nextDouble();
        sc.nextLine();

        areaTriangulo = A*C/2;
        areaCirculo = pi*C*C;
        areaTrapezio = (A+B)*C/2;
        areaQuadrado = B*B;
        areaRetangulo = A*B;

        System.out.printf("%n====== RESULTADO ======%nÁrea Triangulo = %.3f%nÁrea Circulo = %.3f%nÁrea Trapezio = %.3f%nÁrea Quadrado = %.3f%nÁrea Retangulo = %.3f%n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);





    }
}
