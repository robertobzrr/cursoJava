package exercicios.ex_sec09.ex01.application;
import exercicios.ex_sec09.ex01.entities.accountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        accountManager account = new accountManager();

        System.out.println("========== CADASTRO BANCÁRIO ==========");

        System.out.print("N° da Conta: ");
        int numeroConta = input.nextInt();
        account.setNumeroConta(numeroConta);
        input.nextLine();


        System.out.print("Nome do Cliente: ");
        String donoConta = input.nextLine();
        account.setDonoConta(donoConta);



        System.out.println("\nDejesa fazer um deposito incial?\n[1] - Sim\n[0] - Não");
        int depositoInicial = input.nextInt();
        input.nextLine();

            if (depositoInicial == 1){
                System.out.print("Valor: ");
                double deposito = input.nextDouble();
                account.setDepositoInicial(deposito);
                input.nextLine();

            }else{
                int deposito = 0;
                account.setDepositoInicial(deposito);
            }


        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n", account.getNumeroConta(), account.getDonoConta(), account.getDepositoInicial());


        System.out.print("Novo Depósito: ");
        double novoDep = input.nextDouble();
        account.novoDeposito(novoDep);
        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n", account.getNumeroConta(), account.getDonoConta(), account.getDepositoInicial());


        System.out.print("Saque: ");
        double saque = input.nextDouble();
        account.novoSaque(saque);
        System.out.printf("%n=========================%nNº da conta: %d%nDono: %s%nSaldo: %.2f %n=========================%n%n", account.getNumeroConta(), account.getDonoConta(), account.getDepositoInicial());




        input.close();
    }
}
