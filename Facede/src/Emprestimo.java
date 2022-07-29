
import java.util.Calendar;

public class Emprestimo {
	
	private Usuario usuario;
	private Calendar data;
	private Livro livro;
	
	
	public Emprestimo(Usuario usuario,Livro livro) {
		super();
		this.usuario = usuario;
		this.data = Calendar.getInstance();
		this.livro = livro;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	
	
	
	
}
