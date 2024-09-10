public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private int preco;
    private boolean status; 
    // true = disponível. false = emprestado

    // construtor da classe
public Livro(String nome, String autor, String editora, int preco, boolean status) {
    this.nome = nome;
    this.autor = autor;
    this.editora = editora;
    this.preco = preco;
    this.status = status;

}

// getters
public String getNome() {
    return nome;

}

public String getAutor() {
    return autor;
}

public int getPreco() {
    return preco;
}

public boolean isDisponivel() {
    return status;
}

// setters

public void setNome(String nome) {
    this.nome = nome;
}

public void SetAutor(String autor) {
    this.autor = editora;
}

public void setPreco(int preco) {
    this.preco = preco;
}

public void setStatus(boolean  status) {
    this.status = status;
}

// tosTring
public String toString() {
    String disponibilidade = (status) ? "Disponível" : "Emprestado";
    return "Nome: " + nome + ", Autor:  " + autor + ", Editora: " + editora + ", Preço: R$" + preco + ", Status: " + disponibilidade;
}

}
