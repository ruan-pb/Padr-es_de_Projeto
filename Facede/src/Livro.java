


public class Livro {
	
	private String autor;
	private String titulo;
	private String codigo;
	private String genero;
	private String isbn;
	private int quantidadeDeLivro;
	
	
	public Livro(String autor, String titulo, String codigo, String genero, String isbn) {
		this.autor = autor;
		this.titulo = titulo;
		this.codigo = codigo;
		this.genero = genero;
		this.isbn = isbn;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getQuantidadeDeLivro() {
		return quantidadeDeLivro;
	}


	public void setQuantidadeDeLivro(int quantidadeDeLivro) {
		this.quantidadeDeLivro = quantidadeDeLivro;
	}
	
	
	

}
