package exercicios.ex_sec09.ex01.application;
import exercicios.ex_sec09.ex01.entities.accountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        accountManager account = new accountManager();

        System.out.println("========== CADASTRO BANCÁRIO ==========");

        System.out.print("N° da Conta: ");
        account.numeroConta = input.nextInt();
        input.nextLine();

        System.out.print("Nome do Cliente: ");
        account.donoConta = input.nextLine();

        System.out.println("\nDejesa fazer um deposito incial?\n[1] - Sim\n[0] - Não");
        int depositoInicial = input.nextInt();
        input.nextLine();

            if (depositoInicial == 1){
                System.out.print("Valor: ");
                account.depositoInicial = input.nextDouble();
                input.nextLine();
            }else{
                account.depositoInicial = 0;
            }


        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n", account.numeroConta, account.donoConta, account.depositoInicial);


        System.out.print("Novo Depósito: ");
        double novoDep = input.nextDouble();
        account.novoDeposito(novoDep);
        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n", account.numeroConta, account.donoConta, account.depositoInicial);


        System.out.print("Saque: ");
        double saque = input.nextDouble();
        account.novoSaque(saque);
        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n", account.numeroConta, account.donoConta, account.depositoInicial);




        input.close();
    }
}
