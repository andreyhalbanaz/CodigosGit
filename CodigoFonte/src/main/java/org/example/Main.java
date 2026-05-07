import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double valorTotalItens = 0;

        int[] codigosItens = {1, 2, 3, 4, 5, 6, 7};
        String[] nomeItens = {"ByteBurguer Clássico", "ByteBurguer Duplo", "Batata Frita P", "Batata Frita G", "Refrigerante Lata", "Suco Natural", "Água"};
        String[] categoriaItens = {"Lanche", "Lanche", "Acompanhamento", "Acompanhamento", "Bebida", "Bebida", "Bebida"};
        double[] precoItens = {22.90, 29.90, 12.00, 18.00, 7.00, 10.00, 4.00};
        ArrayList<Integer> itensPedido = new ArrayList<>();

        int[] menu = {1, 2, 3, 4, 0};
        int opcaoMenu = -1;
        int encerrar = 1;

        while(encerrar != 0) {

            System.out.println("1. Novo pedido");
            System.out.println("2. Consultar Cardápio por categoria");
            System.out.println("3. Calcular Troco");
            System.out.println("4. Sorteio do Dia");
            System.out.println("0. Encerrar");
            opcaoMenu = s.nextInt();
            s.nextLine();
            String nomeCliente;

            if (opcaoMenu == menu[0]) {
                itensPedido.clear();
                valorTotalItens = 0;
                System.out.println("Nome do cliente: ");
                nomeCliente = s.nextLine();

                for (int i = 0; i < 7; i++) {
                    System.out.println(codigosItens[i] + "- " + nomeItens[i] + " " + categoriaItens[i] + "... R$" + precoItens[i]);
                }

                int adicionarItens = 1;

                while (adicionarItens != 2) {
                    System.out.println("Digite o código do item: ");
                    int codigo = s.nextInt();
                    if (codigo < 1 || codigo > 7) {
                        System.out.println("Código inválido");
                        continue;
                    }
                    s.nextLine();
                    itensPedido.add(codigo);

                    for (int i = 0; i < 7; i++) {
                        if (codigo == codigosItens[i]) {
                            System.out.println(nomeItens[i] + " Adicionado!");
                        }
                    }

                    System.out.println("Adicionar mais itens? (S/N):");
                    String SN = s.nextLine();

                    while (!SN.equals("S") && !SN.equals("N")) {
                        System.out.println("Opção Inválida. Adicionar mais itens? (S/N):");
                        SN = s.nextLine();
                    }

                    if (SN.equals("N")) {
                        adicionarItens = 2;
                    }
                }

                System.out.println("---RESUMO DO PEDIDO---\nNome do cliente: " + nomeCliente);

                for (int item : itensPedido) {
                    int indice = item - 1;
                    System.out.println("Item: " + nomeItens[indice] + "... R$" + precoItens[indice]);
                    valorTotalItens = valorTotalItens + precoItens[indice];
                }

                System.out.println("Valor total dos itens: R$" + valorTotalItens);
            }

            if (opcaoMenu == menu[4]){
                encerrar = 0;
            }

            if (opcaoMenu < 0 || opcaoMenu > 4){
                System.out.println("Opção Inválida, Selecione uma opção novamente:");
                continue;
            }
        }
    }
}