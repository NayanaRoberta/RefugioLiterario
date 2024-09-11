//Importar a  ArrayList para permite criar listas .
import java.util.ArrayList;
// Importar a List
import java.util.List;


//criando uma lista para guardar os livros
public class Biblioteca {
    private List<Livro> Livros;


public Biblioteca() {
    Livros = new ArrayList<>();
}

//adicionar livro
public void adicionarLivro(Livro livro) {
    Livros.add(livro);
    System.out.println("Livro adicionado com sucesso: " + livro);
}

// remover livro pelo nome
public boolean removerLivro(String nome) {
    for (Livro livro : Livros) {
        if (livro.getNome().equalsIgnoreCase(nome)) {
            Livros.remove(livro);
            System.out.println("Livro removido com sucesso: " + livro);
            return true;
        }
    }
    System.out.println("Livro com o nome" + nome + "não encontrar.");
    return false;

}

// listar todos os livros

public void listarLivros() {
    if (Livros.isEmpty()) {
        System.out.println("Nnehum livro encontrado.");
    } else {
        System.out.println("Lista de livros na biblioteca Refúgio Literário:");
        for (Livro livro :Livros) {

        }
    }
}

// buscar livro pelo título
public void buscarLivro(String titulo) {
    boolean encontrado = false;
    for (Livro livro : Livros) {
        if (livro.getNome().toLowerCase().contains(titulo.toLowerCase())) {
            System.out.println("Livro encontrado: " + livro);
            encontrado = true;

        }
    }
    if (!encontrado) {
        System.out.println("Nenhum livro encontrado com o título: " + titulo);
        }
    }
}
