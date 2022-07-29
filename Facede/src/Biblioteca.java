
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Biblioteca {
	
	public Map<String, Livro> livros = new HashMap<>();
	public List<Livro> livrosJaCadastrado = new LinkedList<>();
	private List<Emprestimo> listaDeEmprestimo = new LinkedList<>();
	
	public Livro cadastrarLivro(Livro livro) {
		validarCadastroLivro(livro);
		livros.put(livro.getCodigo(), livro);
		livrosJaCadastrado.add(livro);
		return livro;
		
	}
	public List<Livro> ConsultaAcervoComTitulo(String titulo){
		validarConsultaDoLivroComCodigo(titulo);
		for(Livro livro: livros.values()) {
			livrosJaCadastrado.add(livro);
			
		}
		return livrosJaCadastrado;
	}
	public List<Livro> ConsultaAcervoComIsbn(String isbn){
		validarConsultaDoLivroComIsbn(isbn);
		for(Livro livro: livros.values()) {
			livrosJaCadastrado.add(livro);
			
		}
		return livrosJaCadastrado;
	}
	
	public Emprestimo efetuarEmprestimo(Livro livro,Usuario usuario) {
		validarEmprestimo(livro);
		Emprestimo emprestimo = new Emprestimo(usuario, livro);
		listaDeEmprestimo.add(emprestimo);
		return emprestimo;
		
		
	}
	public int verificarDisponibilidade(Livro livro) {
		int quantidade = 0;
		for(Livro livroDisponivel: livros.values()) {
			if(livroDisponivel.getQuantidadeDeLivro()>0) {
				quantidade = livroDisponivel.getQuantidadeDeLivro();
			}
		}
		return quantidade;

	}
	
	
	private void validarEmprestimo(Livro livro) {
		if(!livros.containsKey(livro.getCodigo())) {
			throw new LivroNaoExisteException("Livro não existe");
		}
	}
	
	
	
	private void validarCadastroLivro(Livro livro) throws LivroJaCadastradoException, LivroInvalido {
		if(livros.containsKey(livro.getCodigo())) {
			throw new LivroJaCadastradoException("Livro já Cadastrado");
		}
		if(Objects.isNull(livro)) {
			throw new LivroInvalido("Livro Invalido");
		}
	}
	private void validarConsultaDoLivroComCodigo(String codigo) throws LivroJaCadastradoException, LivroInvalido {
		Livro livro = livros.get(codigo);
		if(!livros.containsKey(codigo) || livro.getIsbn().equals(codigo)) {
			throw new LivroNaoExisteException("Livro Não Encontrado");
		}
		if(Objects.isNull(codigo)) {
			throw new LivroInvalido("Código Invalido");
		}
	}
	private void validarConsultaDoLivroComIsbn(String isbn) throws LivroJaCadastradoException, LivroInvalido {
		
		for(Livro livro: livros.values()) {
			if(!livro.getIsbn().equals(isbn)) {
				throw new LivroNaoExisteException("Livro Não Encontrado");
			}
			if(Objects.isNull(isbn)) {
				throw new LivroInvalido("Código Invalido");
			}
			
			
		}

	}
	
	

}
