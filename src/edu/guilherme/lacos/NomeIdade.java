package edu.guilherme.lacos;

import java.util.Scanner;

public class NomeIdade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String nome = "";
    String resposta;
    int idade = 0;
    boolean continuarRegistro = true;

    while(continuarRegistro) {
      System.out.print("Nome: ");
      nome = scan.next();
      System.out.print("Idade: ");
      idade = scan.nextInt();
      System.out.print("Continuar registrando? [Sim, Não]: ");
      resposta = scan.next();
      continuarRegistro = resposta.equals("Sim");
    }

    System.out.println("Ultimos dados registrados foram de " + nome + ", idade: " + idade + " anos.");
  }
}
