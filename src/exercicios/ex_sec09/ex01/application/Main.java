package exercicios.ex_sec09.ex01.application;
import exercicios.ex_sec09.ex01.entities.accountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        accountManager accountManager;

        System.out.println("========== CADASTRO BANCÁRIO ==========");

        System.out.print("N° da Conta: ");
        int numeroConta = input.nextInt();
        input.nextLine();

        System.out.print("Nome do Cliente: ");
        String donoConta = input.nextLine();

        System.out.println("\nDejesa fazer um deposito incial?\n[1] - Sim\n[0] - Não");
        int escolha = input.nextInt();
        input.nextLine();

            if (escolha == 1){
                System.out.print("Valor: ");
                double depositoInicial = input.nextDouble();
                input.nextLine();
                accountManager = new accountManager(numeroConta, donoConta, depositoInicial);

            }else{
                accountManager = new accountManager(numeroConta, donoConta);
            }

        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n", accountManager.getNumeroConta(), accountManager.getDonoConta(), accountManager.getDepositoInicial());
        System.out.print("Novo Depósito: ");
        double deposito = input.nextDouble();
        accountManager.deposito(deposito);

        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n", accountManager.getNumeroConta(), accountManager.getDonoConta(), accountManager.getDepositoInicial());
        System.out.print("Saque: ");
        double saque = input.nextDouble();
        accountManager.saque(saque);

        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n",accountManager.getNumeroConta(), accountManager.getDonoConta(), accountManager.getDepositoInicial());
        input.close();
    }
}
