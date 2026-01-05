package Main;

import Model.*;

public class Main {

	public static void main(String[] args) {
		
		//Cadastrar livros
		Livro l1 = new LivroFisico("Java: Como Programar", "Deitel & Deitel", 5);
		Livro l2 = new LivroFisico("Padrões de Projeto", "Erich Gamma", 3);
		Livro l3= new LivroFisico("Estruturas de Dados e Algoritmos", "Mark Allen Weiss", 4);
		
		Livro l4 = new LivroDigital("Clean Code", "Robert C. Martin", 999);
		Livro l5 = new LivroDigital("O Programador Pragmático", "Andrew Hunt e David Thomas", 999);
		
		//Cadastrar usuario
		Usuario u1 = new Usuario("Gustavo");
		
		//Biblioteca
		Biblioteca carrinho = new Biblioteca();
		
		carrinho.cadastrarLivro(l1);
		carrinho.cadastrarLivro(l2);
		carrinho.cadastrarLivro(l3);
		carrinho.cadastrarLivro(l4);
		carrinho.cadastrarLivro(l5);
		
		carrinho.realizarEmprestimo(l1, u1);
		carrinho.realizarEmprestimo(l2, u1);
		carrinho.realizarEmprestimo(l5, u1);
		
		carrinho.listarLivros();
		

	}

}
