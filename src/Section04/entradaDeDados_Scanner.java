package Section04;

import java.util.Scanner;

public class entradaDeDados_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String nome;
        int idade;
        double y;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite qualquer valor numérico apenas para consumir o buffer do nextInt acima: ");
        y = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Nome: %s%nIdade: %d%nValor aleatório: %.2f", nome, idade, y);





        sc.close();


    }
}
