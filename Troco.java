package org.example;

import java.util.Scanner;

public class Troco {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    double valorPago = 0;
    double valorTotalItens = 0;

    if (true) {

      System.out.println("Total do pedido: R$ " + valorTotalItens + "\nQual é o valor que o cliente pagou?");
      valorPago = s.nextDouble();

      while (valorPago < valorTotalItens) {
        System.out.println("O valor pago pelo cliente não foi o suficiente para cobrir os gastos,\n" +
                "insira um valor que cubra os gastos: ");
        valorPago = s.nextDouble();
      }

      double troco = valorPago - valorTotalItens;

      System.out.println("");

      System.out.printf("Troco: R$ %.2f%n", troco);
    }
  }
}