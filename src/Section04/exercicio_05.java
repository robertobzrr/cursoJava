package Section04;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double totalCompra, precoItem1 = 25.99, precoItem2 = 65.99, precoItem3 = 12.99;
        int escolha, qntddItem, codItem1 = 1, codItem2 = 2, codItem3 = 3;

        System.out.println("====== Lojinha de Roupas ======");
        System.out.printf("Escolha o item que deseja comprar:%n[1] - Camisa%n[2] - Calça%n[3] - Meia%n%n[0] - Sair%n", codItem1, codItem2, codItem3);
        escolha = sc.nextInt();
        sc.nextLine();

        if (escolha == 1) {
            System.out.printf("%nVocê escolheu: Camisa.%nPreço (unid) = R$%.2f%nQuantas deseja comprar? ", precoItem1);
            qntddItem = sc.nextInt();
            sc.nextLine();

            totalCompra = qntddItem * precoItem1;
            System.out.printf("%n ====== Resumo do pedido ======%nVocê selecionou %dx Camisas%n%nTOTAL = R$%.2f%n%n", qntddItem, totalCompra);
        }

        else if (escolha == 2) {
            System.out.printf("%nVocê escolheu: Calça.%nPreço (unid) = R$%.2f%nQuantas deseja comprar? ", precoItem2);
            qntddItem = sc.nextInt();
            sc.nextLine();

            totalCompra = qntddItem * precoItem2;
            System.out.printf("%n ====== Resumo do pedido ======%nVocê selecionou %dx Camisas%n%nTOTAL = R$%.2f%n%n", qntddItem, totalCompra);

        }

        else if (escolha == 3) {
            System.out.printf("%nVocê escolheu: Meia.%nPreço (unid) = R$%.2f%nQuantas deseja comprar? ", precoItem3);
            qntddItem = sc.nextInt();
            sc.nextLine();

            totalCompra = qntddItem * precoItem3;
            System.out.printf("%n ====== Resumo do pedido ======%nVocê selecionou %dx Camisas%n%nTOTAL = R$%.2f%n%n", qntddItem, totalCompra);
        }

        else {
            System.out.println("Fim.");
        }




    }
}
