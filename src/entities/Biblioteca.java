package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<>();

	public void adicionarLivro(String titulo, String autor) {
		livros.add(new Livro(titulo, autor));
	}

	public List<Livro> listaLivros() {
		return new ArrayList<>(livros);
	}
	
	/**
	 * 
	 * @param autor
	 * @return
	 */
	
	public List<Livro> buscarPorAutor(String autor) {
		return livros.stream()
				.filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
				.collect(Collectors.toList());
	}

}
