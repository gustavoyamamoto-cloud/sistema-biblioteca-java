package Model;

public abstract class Livro {

	private String titulo;
	private String autor;
	private int quantDisponivel = 0;
	
	//Construtor
	public Livro(String titulo, String autor, int quantDisponivel){
		setTitulo(titulo);
		setAutor(autor);
		setQuantDisponivel(quantDisponivel);
	}
	
	//Setters
	public void setTitulo(String titulo) {
		if(titulo == null || titulo.trim().isEmpty()) {
			throw new IllegalArgumentException("Título inválido");
		}
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		if(autor == null || autor.trim().isEmpty()) {
			throw new IllegalArgumentException("Título inválido");
		}
		this.autor = autor;
	}
	
	public void setQuantDisponivel(int quantDisponivel) {
		if(quantDisponivel < 0) {
			throw new IllegalArgumentException("Quantidade não pode ser negativa");
		}
		this.quantDisponivel = quantDisponivel;
	}
	
	
	//Getters
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getQuantDisponivel() {
		return quantDisponivel;
	}
	
	//Metodos
	public abstract void info();
	
	public boolean emprestar() {
	    if (quantDisponivel > 0) {
	        quantDisponivel--;
	        return true;
	    }
	    return false;
	}
}
