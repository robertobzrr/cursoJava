package Section04;

public class areaTrapezio {
    public static void main(String[] args) {

        float b = 6f;
        float h = 5f;
        float B = 8f;

        System.out.println("Área de um trapézio é: A = (b+B)/2 * h\nConsiderando os valores b=6, h=5 e B=8. Qual o valor da área?");

        float area = (b+B)/2f*h;

        System.out.printf("Área = %.2f", area);


    }
}
