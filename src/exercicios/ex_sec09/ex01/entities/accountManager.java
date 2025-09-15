package exercicios.ex_sec09.ex01.entities;


public class accountManager {

    public int numeroConta;
    public String donoConta;
    public double depositoInicial;


    public void novoDeposito(double novoDep){
        this.depositoInicial += novoDep;
    }

    public void novoSaque(double saque){
        this.depositoInicial -= saque;
    }


}
