package Model;

public class LivroDigital extends Livro {
	
	//Costrutor
	public LivroDigital(String titulo, String autor, int quantDisponivel) {
		super(titulo, autor, quantDisponivel);
	}
	
	//Metodos
	public void info() {
		System.out.println("Titulo: "+ getTitulo());
		System.out.println("Autor: "+ getAutor());
		System.out.println("Quantidade: "+ getQuantDisponivel());
		System.out.println("-------------------------");
	}
	
}
