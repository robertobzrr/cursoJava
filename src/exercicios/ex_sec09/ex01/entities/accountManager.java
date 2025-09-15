package exercicios.ex_sec09.ex01.entities;


public class accountManager {

    private final int numeroConta;
    private String donoConta;
    private double saldo;


    public accountManager(int numeroConta, String donoConta, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.donoConta = donoConta;
        deposito(depositoInicial);
    }

    public accountManager(int numeroConta, String donoConta) {
        this.numeroConta = numeroConta;
        this.donoConta = donoConta;
    }


    public int getNumeroConta() {
        return numeroConta;
    }
    public String getDonoConta() {
        return donoConta;
    }
    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }
    public double getDepositoInicial() {
        return saldo;
    }




    public void deposito(double deposito){
        this.saldo += deposito;
    }

    public void saque(double saque){
        this.saldo -= saque+5;
    }


    //dúvida para levar na aula: como o metodo deposito no construtor pode estar enviando a variavel depositoInicial
    // para o metodo deposito se no metodo ele ta recebendo double deposito, como é possivel e como o java entende o envio de deposito(depositoIncial) para deposito(double deposito)


}
