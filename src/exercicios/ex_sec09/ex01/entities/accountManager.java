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


}
