package edu.guilherme.lacos;

import java.util.Scanner;

public class MaiorEMedia {
  public static void main(String[] args) {
    // Algoritmo que lê 5 números, imprime o maior e a média entre eles.
    Scanner scan = new Scanner(System.in);
    int valor, soma, maior, indice;
    soma = 0;
    maior = 0;
    indice = 0;

    do {
      System.out.print("Digite o " + (indice + 1) + "º valor: ");
      valor = scan.nextInt();
      soma += valor;
      if (valor > maior) maior = valor;
      indice += 1;
    } while (indice < 5);

    System.out.println("Valor da soma entre todos os valores digitados é: " + soma);
    System.out.println("Média entre todos os valores digitados é: " + (soma / indice));
  }
}
