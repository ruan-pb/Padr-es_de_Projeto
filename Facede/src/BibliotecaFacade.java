
import java.util.List;

public class BibliotecaFacade {
	
	Biblioteca biblioteca = new Biblioteca();
	
	
	
	
	public Livro CadastrarLivro(Livro livro) {
		return this.biblioteca.cadastrarLivro(livro);
	}
	
	public List<Livro> ConsultarLivroComTitulo(String titulo) {
		return this.biblioteca.ConsultaAcervoComTitulo(titulo);
	}
	
	public List<Livro>ConsultaLivroComIsbn(String isbn){
		return this.biblioteca.ConsultaAcervoComIsbn(isbn);
	}
	public int verificarDisponibilidadeDeLivro(Livro livro) {
		return this.biblioteca.verificarDisponibilidade(livro);
	}
	public Emprestimo efetuarEmprestimo(Usuario usuario,Livro livro) {
		return this.biblioteca.efetuarEmprestimo(livro, usuario);
	}

}
