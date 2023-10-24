package com.trybe.java.regraprogressao;

public class AtividadesInfo {
  private String nome;
  private double peso;
  private double nota;

  /**
   * Métodos e atributos.
   */
  public AtividadesInfo(String nome, double peso, double nota) {
    this.nome = nome;
    this.peso = peso;
    this.nota = nota;
  }

  /**
   * Getters e setters.
   */

  public String getNome() {
    return nome;
  }

  public double getPeso() {
    return peso;
  }

  public double getNota() {
    return nota;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }
}
