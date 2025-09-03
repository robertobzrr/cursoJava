package aula02_processamentoDeDados_Casting;

import java.sql.SQLOutput;
import java.util.Scanner;

public class entradaDeDados_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.printf("Nome: %s%nIdade: %d", nome, idade);





        sc.close();


    }
}
