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

    double pesoTotal = 0;
    double notaTotal = 0;

    for (int i = 0; i < numeroAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      nome[i] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      peso[i] = scanner.nextDouble();
      scanner.nextLine();
      System.out.println("Digite a nota obtida para " + nome[i] + ": ");
      nota[i] = scanner.nextDouble();
      scanner.nextLine();

      pesoTotal += peso[i];
      notaTotal += (peso[i] * nota[i]) / 100;
    }

    if (pesoTotal != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    scanner.close();
  }
}