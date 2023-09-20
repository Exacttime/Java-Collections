package list.OrdenaçãoDePessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public int compareTo(Pessoa P) {
    return Integer.compare(idade, P.getIdade());
  }

  public double getAltura() {
    return altura;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public String toString() {
    return nome + " " + idade + " " + altura;
  }
}

class CompararPorAltura implements Comparator<Pessoa> {
  @Override
  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }
}
