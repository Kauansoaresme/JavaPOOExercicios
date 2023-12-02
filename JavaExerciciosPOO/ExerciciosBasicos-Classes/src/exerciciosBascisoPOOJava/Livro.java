package exerciciosBascisoPOOJava;
import java.util.Scanner;
//Crie uma classe chamada 'Livro' com atributos como título, autor e número de páginas. Adicione métodos para exibir informações sobre o livro. 

public class Livro {
	
	private String titulo;
	private String autor;
	private short numeroPag;
	
	public Livro(String titulo, String autor, short numeroPag) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPag = numeroPag;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public short getNumeroPag() {
		return numeroPag;
	}

	
	public void informações(){
		System.out.println("Sobre o livro:");
		System.out.println("Título: "+ titulo);
		System.out.println("Autor: "+ autor);
		System.out.println("Número de páginas:" + numeroPag);
	}
	


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o título do Livro:");
			String titulo = entrada.nextLine();
			System.out.println("Digite o nome do autor: ");
			String autor = entrada.nextLine();
			System.out.println("Número de páginas: ");
			short paginas = entrada.nextShort();
			
			Livro livro = new Livro(titulo, autor, paginas);
			livro.informações();
		entrada.close();

	}

	

}
