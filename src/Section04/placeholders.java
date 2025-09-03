package Section04;
import java.util.Locale;

public class placeholders {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);


        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f.%n%s, which price is $%.2f", product1, price1, product2, price2);
        // formatação acima usando 2 linhas em um mesmo printf
        System.out.printf("%n%nRecord: %d years old, code %d and gender: %s", age, code, gender);
        System.out.printf("%n%nMeasure with eight decimal places: %.8f", measure);
        System.out.printf("%nRouded (three decimal places): %.3f", measure);
        System.out.printf("%nUS decimal point: %.1f%n%n", measure);





    }
}