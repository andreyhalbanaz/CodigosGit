

            if (opcaoMenu == menu[3]) {
                int sorteado = (int) (Math.random() * 7) + 1;
                int indiceSorteado = sorteado - 1;
                double precoComDesconto = precoItens[indiceSorteado] * 0.8;

                System.out.println("\n--- SORTEIO DO DIA ---");
                System.out.println("Item: " + nomeItens[indiceSorteado] + " com 20% de DESCONTO!");
                System.out.printf("O valor com desconto é: R$ %.2f%n", precoComDesconto);
                System.out.println("-----------------------");

                if (itensPedido.contains(sorteado)) {
                    System.out.println("Parabéns! Você já tem esse item. Aplicando desconto...");

                    valorTotalItens = 0;
                    for (int item : itensPedido) {
                        int idx = item - 1;
                        if (item == sorteado) {
                            valorTotalItens += precoItens[idx] * 0.8;
                        } else {
                            valorTotalItens += precoItens[idx];
                        }
                    }
                } else {

                    System.out.println("Gostaria de adicionar esse item ao seu pedido? (S/N):");
                    String resposta = s.nextLine();

                    if (resposta.equalsIgnoreCase("S")) {
                        itensPedido.add(sorteado);
                        valorTotalItens += precoComDesconto;
                        System.out.println(nomeItens[indiceSorteado] + " adicionado com sucesso!");
                    } else {
                        System.out.println("Oferta recusada.");
                    }
                }

                if (!itensPedido.isEmpty()) {
                    System.out.println("\n--- RESUMO ATUALIZADO ---");
                    System.out.printf("Valor total do pedido: R$ %.2f%n", valorTotalItens);
                } else {
                    System.out.println("Seu pedido ainda está vazio.");
                }
                System.out.println("Voltando ao menu principal...\n");
            }

