package Section08.program01.application;

import Section08.program01.entities.Product;

import java.util.Scanner;

public class Main {
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

        System.out.printf("===== Produto =====%nNome: %s%nPreço: %.2f%nQntd Estoque: %d%n===================%n%n", product.name, product.price, product.quantity);


        System.out.println("Vamos Atualizar os dados.");
        System.out.print("Adicionar ao estoque: ");
        int add =  input.nextInt();
        product.addProduct(add);
        System.out.println("Estoque atualizado: "+product.quantity);

        System.out.print("Remover do estoque: ");
        int remove = input.nextInt();
        product.removeProduct(remove);
        System.out.println("Estoque Atualizado: "+product.quantity);

        System.out.printf("\n\n===== Produto =====%nNome: %s%nPreço: %.2f%nQntd Estoque: %d%n===================%n%n", product.name, product.price, product.quantity);


        input.close();
    }
}
