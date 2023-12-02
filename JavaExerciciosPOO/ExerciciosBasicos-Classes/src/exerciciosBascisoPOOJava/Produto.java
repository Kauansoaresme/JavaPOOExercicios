package exerciciosBascisoPOOJava;
import java.util.Scanner;
//Crie uma classe 'Produto' com atributos como nome, preço e quantidade em estoque. Adicione métodos para realizar compras e exibir informações sobre o produto. 

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto(String nome, double preco, int quantidadeEmEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public void realizarCompra(int quantidade) {
		if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
			double total = quantidade * preco;
			System.out.println("Compra realizada com sucesso:");
			System.out.println("Produto: " + nome);
			System.out.println("Quantidade comprada: " + quantidade);
			System.out.println("Total a pagar: R$" + total);

			quantidadeEmEstoque -= quantidade;
		} else {
			System.out.println("Quantidade inválida ou insuficiente em estoque.");
		}
	}

	public void exibirInformacoes() {
		System.out.println("Informações sobre o produto:");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: R$" + preco);
		System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		String nomeProduto =  entrada.nextLine();

		System.out.print("Digite o preço do produto: R$");
		double precoProduto =  entrada.nextDouble();

		System.out.print("Digite a quantidade em estoque do produto: ");
		int quantidadeEstoqueProduto =  entrada.nextInt();

		Produto produto = new Produto(nomeProduto, precoProduto, quantidadeEstoqueProduto);

		while (true) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Realizar compra");
			System.out.println("2 - Exibir informações");
			System.out.println("0 - Sair");

			int opcao =  entrada.nextInt();
			 entrada.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite a quantidade a comprar: ");
				int quantidadeCompra =  entrada.nextInt();
				produto.realizarCompra(quantidadeCompra);
				break;
			case 2:
				produto.exibirInformacoes();
				break;
			case 0:
				System.out.println("Encerrando a aplicação.");
				 entrada.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}
