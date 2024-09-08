public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int preco;
	private String status;

// construtor
	
public Livro(String titulo, String autor, String editora, int preco, String status){
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
		this. status = status;

}

//metodo 

public String getTitulo() {
	return titulo;
}

public String getAutor() {
	return autor;
}

public String getEditora() {
	return editora;

}

public int getPreco() }
	return preco;
}


public String getStatus() {
	return status;
}

//metodo toString para mostrar informaçãos do livro
@Override
	
public String toString() {
	return "Titulo: " + titulo + ", Autor: " + autor + ", Editora: " + editora + ", Preco: " + preco + ", Status: " + status +";
}

}
