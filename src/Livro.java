//armazenar informações sobre o livro
public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private int preco;
    private boolean status; 
    // true = disponível. false = emprestado

    // construtor da classe = criar um novo livro
public Livro(String nome, String autor, String editora, int preco, boolean status) {
    this.nome = nome;
    this.autor = autor;
    this.editora = editora;
    this.preco = preco;
    this.status = status;

}

// getters = pegar as informações dos atributos
//obter nome para o livro
    public String getNome() {
    return nome;

}
//obter autor para o livro
public String getAutor() {
    return autor;
}
// obter valor para a multa = atraso livro
public int getPreco() {
    return preco;
}
//saber se está disponivel ou não disponive para o livro
public boolean isDisponivel() {
    return status;
}

// setters = mudar os atributos 
// novo nome para o livro
public void setNome(String nome) {
    this.nome = nome;
}
//novo autor 
public void SetAutor(String autor) {
    this.autor = editora;
}
//novo valor para a multa
public void setPreco(int preco) {
    this.preco = preco;
}
//definor noovo status  
public void setStatus(boolean  status) {
    this.status = status;
}

// tosTring = retorna uma representação em texto das informações do livro
public String toString() {
    String disponibilidade = (status) ? "Disponível" : "Emprestado";
    return "Nome: " + nome + ", Autor:  " + autor + ", Editora: " + editora + ", Preço: R$" + preco + ", Status: " + disponibilidade;
}

}
