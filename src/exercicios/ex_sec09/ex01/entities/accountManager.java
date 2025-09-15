package exercicios.ex_sec09.ex01.entities;


public class accountManager {

    private int numeroConta;
    private String donoConta;
    private double depositoInicial;



    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getDonoConta() {
        return donoConta;
    }
    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }
    public void setDepositoInicial(double deposito) {
        this.depositoInicial = deposito;
    }



    public void novoDeposito(double novoDep){
        this.depositoInicial += novoDep;
    }

    public void novoSaque(double saque){
        this.depositoInicial -= saque;
    }


}
