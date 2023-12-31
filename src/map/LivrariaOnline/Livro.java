package map.LivrariaOnline;

public class Livro {
  private String titulo;
  private String autor;
  private double preco;

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public double getPreco() {
    return preco;
  }

  public Livro(String titulo, String autor, double preco) {
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "\n";
  }

}
