package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	
	static Gato gato = new Gato();
	static Livros livro = new Livros();
	
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println("Ol� Mundo n�mero -> " + (a+b));
		System.out.println(gato);
		System.out.println(livro);

	}

}

class Livros {
	private String nome;
	private String npag;
}