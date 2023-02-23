package edu.guilherme.lacos;

import java.util.Scanner;

public class Nota {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nota = 0;

    while (nota >= 0 && nota <= 10) {
      System.out.print("Digite uma nota entre 0 e 10: ");
      nota = scan.nextInt();
      if (nota >= 0 && nota <= 10) {
        System.out.println("Valor digitado está dentro do esperado, continue digitando...");
      } else {
        System.out.println("Valor digitado está fora do esperado, laço sendo encerrado!");
      }
    }
  }
}
