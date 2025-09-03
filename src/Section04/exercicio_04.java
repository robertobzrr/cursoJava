package Section04;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numFunc, novoCalc;
        double horaTrab, valorHora, salario;

        do {

            System.out.println("====== Calcular Salário ======");
            System.out.print("Digite seu nº de Funcionário: ");
            numFunc = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite seu nº de horas trabalhadas: ");
            horaTrab = sc.nextDouble();
            sc.nextLine();

            System.out.print("Digite o valor que recebe por hora: ");
            valorHora = sc.nextDouble();
            sc.nextLine();

            salario = valorHora * horaTrab;
            System.out.printf("%nFuncionário nº%d%nSalário = %.2f",numFunc, salario);


            System.out.printf("%n%nDeseja fazer uma nova consulta?%n[1] Sim%n[0] Não%n");
            novoCalc = sc.nextInt();
            sc.nextLine();


        }while(novoCalc==1);
        System.out.println("Programa Finalizado!");
        sc.close();
    }
}
