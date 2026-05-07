import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] codigosItens = {1, 2, 3, 4, 5, 6, 7};

        String[] nomeItens = {"ByteBurguer Clássico", "ByteBurguer Duplo", "Batata Frita P", "Batata Frita G", "Refrigerante Lata", "Suco Natural", "Água"};

        String[] categoriaItens = {"Lanche", "Lanche", "Acompanhamento", "Acompanhamento", "Bebida", "Bebida", "Bebida"};

        double[] precoItens = {22.90, 29.90, 12.00, 18.00, 7.00, 10.00, 4.00};

        int[] menu = {1, 2, 3, 4, 0};

        int opcaoMenu = -1;

        int encerrar = 1;

        while (encerrar != 0) {

            System.out.println("1. Novo pedido");

            System.out.println("2. Consultar Cardápio por categoria");

            System.out.println("3. Calcular Troco");

            System.out.println("4. Sorteio do Dia");

            System.out.println("0. Encerrar");

            opcaoMenu = s.nextInt();

            s.nextLine();

            if (opcaoMenu == menu[1]) {

                System.out.println("1. Lanches");

                System.out.println("2. Acompanhamentos");

                System.out.println("3. Bebidas");

                int subMenu = s.nextInt();

                switch (subMenu) {

                    case 1:

                        System.out.println(codigosItens[0] + "- " + nomeItens[0] + " " + categoriaItens[0] + "... R$" + precoItens[0]);

                        System.out.println(codigosItens[1] + "- " + nomeItens[1] + " " + categoriaItens[1] + "... R$" + precoItens[1]);

                        break;

                    case 2:

                        System.out.println(codigosItens[2] + "- " + nomeItens[2] + " " + categoriaItens[2] + "... R$" + precoItens[2]);

                        System.out.println(codigosItens[3] + "- " + nomeItens[3] + " " + categoriaItens[3] + "... R$" + precoItens[3]);

                        break;

                    case 3:

                        System.out.println(codigosItens[4] + "- " + nomeItens[4] + " " + categoriaItens[4] + "... R$" + precoItens[4]);

                        System.out.println(codigosItens[5] + "- " + nomeItens[5] + " " + categoriaItens[5] + "... R$" + precoItens[5]);

                        System.out.println(codigosItens[6] + "- " + nomeItens[6] + " " + categoriaItens[6] + "... R$" + precoItens[6]);

                        break;

                }

            }

            if (opcaoMenu == menu[4]) {

                encerrar = 0;

            }

            if (opcaoMenu < 0 || opcaoMenu > 4) {

                System.out.println("Opção Inválida, Selecione uma opção novamente:");

                continue;

            }

        }

    }

}
