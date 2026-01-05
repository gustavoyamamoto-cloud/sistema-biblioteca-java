package Model;

public class Usuario {

	private String nome;
	private int itensEmprestados = 0;
	
	//Contrutor
	public Usuario(String nome) {
		setNome(nome);
	}
	
	
	//Setters
	public void setNome(String nome) {
		if(nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}
	
	public void setItensEmprestados(int itensEmprestados) {
	    if (itensEmprestados < 0) {
	        throw new IllegalArgumentException("Itens emprestados inválido");
	    }
	    this.itensEmprestados = itensEmprestados;

	}
	
	
	//Getters
	public String getNome() {
		return nome;
	}
	
	public int getItensEmprestados() {
		return itensEmprestados;
	}
}
