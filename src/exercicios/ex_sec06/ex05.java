package exercicios.ex_sec06;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pedido, quantidade;
        int cod01=1, cod02=2, cod03=3, cod04=4, cod05=5;
        double total, preco_cod01 = 4.00, preco_cod02 = 4.50, preco_cod03 = 5.00, preco_cod04 = 2.00, preco_cod05 = 1.50;



        System.out.println("=============== MENU ===============");
        System.out.println("CÓDIGO   /   PRODUTO   /   VALOR ");
        System.out.println("1 --- Cachorro-Quente --- R$: 4.00");
        System.out.println("2 --- X-Salada ---------- R$: 4.50");
        System.out.println("3 --- X-Bacon ----------- R$: 5.00");
        System.out.println("4 --- Torrada Simples --- R$: 2.00");
        System.out.println("5 --- Refrigerante ------ R$: 1.50");

        System.out.print("\n==== Faça seu pedido ==== ");
        System.out.print("\nDigite o cod do produto: ");
        pedido = sc.nextInt();
        sc.nextLine();

        switch (pedido){
            case 1:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                sc.nextLine();

                total = preco_cod01*quantidade;
                System.out.printf("Total = R$%.2f", total);
                break;

            case 2:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                sc.nextLine();

                total = preco_cod02*quantidade;
                System.out.printf("Total = R$%.2f", total);
                break;

            case 3:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                sc.nextLine();

                total = preco_cod03*quantidade;
                System.out.printf("Total = R$%.2f", total);
                break;

            case 4:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                sc.nextLine();

                total = preco_cod04*quantidade;
                System.out.printf("Total = R$%.2f", total);
                break;

            case 5:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                sc.nextLine();

                total = preco_cod05*quantidade;
                System.out.printf("Total = R$%.2f", total);
                break;
        }


        sc.close();
    }
}
