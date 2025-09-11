package Section08.program01.entities;

import Section08.program01.application.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Digite os dados do produto.");

        System.out.print("Nome: ");
        product.name = input.nextLine();

        System.out.print("Preço: ");
        product.price = input.nextDouble();
        input.nextLine();

        System.out.print("Estoque: ");
        product.quantity = input.nextInt();
        input.nextLine();

        System.out.printf("===== Produto =====%nNome: %s%nPreço: %.2f%nQntd Estoque: %d%n===================", product.name, product.price, product.quantity);



    }
}
