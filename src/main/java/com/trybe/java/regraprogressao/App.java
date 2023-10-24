package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    Scanner scanner = new Scanner(System.in);
    int numeroAtividades = scanner.nextInt();
    scanner.nextLine();

    String[] nome = new String[numeroAtividades];
    double[] peso = new double[numeroAtividades];
    double[] nota = new double[numeroAtividades];

    for (int i = 0; i < numeroAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      nome[i] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      peso[i] = scanner.nextDouble();
      scanner.nextLine();
      System.out.println("Digite a nota obtida para " + nome[i] + ": ");
      nota[i] = scanner.nextDouble();
      scanner.nextLine();
    }

    scanner.close();
  }
}