package com.betrybe.sistemadevotacao;

public abstract class Pessoa {
  protected String nome;

  public Pessoa() {}

  public String getNome() {
    return this.nome;
  }

  public void setNome(String name) {
    this.nome = name;
  }
}
