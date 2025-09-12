package exercicios.ex_sec08.ex03.application;
import exercicios.ex_sec08.ex03.entities.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.print("Digite o atual valor do Dollar: ");
        double dollar = input.nextDouble();
        input.nextLine();

        System.out.print("Quantos dollars deseja comprar: ");
        double dollarBought = input.nextDouble();
        input.nextLine();

        double finalValue = CurrencyConverter.dollarConverted(dollarBought, dollar);



        System.out.printf("Na compra de $%.2f Dollars, você pagará R$%.2f", dollarBought, finalValue);





    }
}
