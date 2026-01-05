package Model;

import java.util.ArrayList;


public class Biblioteca {

	ArrayList<Livro> livros = new ArrayList<>();
	ArrayList<Usuario> user = new ArrayList<>();
	
	//Metodos
	public void cadastrarLivro(Livro l) {
		if(l == null) {
			throw new IllegalArgumentException("Livro não pode ser nulo");
		}
		livros.add(l);
	}
	
	public void cadastrarUsuario(Usuario u) {
		if(u == null) {
			throw new IllegalArgumentException("Usuário não pode ser nulo");
		}
		user.add(u);
	}
	
	public void listarLivros() {
		for(int i = 0; i < livros.size(); i++) {
			livros.get(i).info();
		}
	}
	
	public void realizarEmprestimo(Livro l, Usuario u) {
		if(l == null || u == null) {
			throw new IllegalArgumentException("Livro ou usuário inválido");
		}
		
		if(l.emprestar()) {
			u.setItensEmprestados(u.getItensEmprestados() + 1);
			System.out.println("Empréstimo realizado com sucesso");
		}else {
			System.out.println("Livro indisponível");
		}
	}
}
