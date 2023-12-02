package exerciciosBascisoPOOJava;
import java.util.ArrayList;
import java.util.Scanner;
//Crie uma classe 'Empresa' com atributos como nome, CNPJ e lista de funcion�rios. Adicione m�todos para contratar, demitir e exibir informa��es sobre os funcion�rios. 


public class Empresa {
	private String nome;
	private String cnpj;
	private ArrayList<String> funcionarios;

	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new ArrayList<>();
	}

	public void contratarFuncionario(String nomeFuncionario) {
		funcionarios.add(nomeFuncionario);
		System.out.println("Funcion�rio contratado: " + nomeFuncionario);
	}

	public void demitirFuncionario(String nomeFuncionario) {
		if (funcionarios.remove(nomeFuncionario)) {
			System.out.println("Funcion�rio demitido: " + nomeFuncionario);
		} else {
			System.out.println("Funcion�rio n�o encontrado.");
		}
	}

	public void exibirInformacoesFuncionarios() {
		if (funcionarios.isEmpty()) {
			System.out.println("A empresa n�o possui funcion�rios para exibir.");
		} else {
			System.out.println("Funcion�rios da empresa " + nome + ":");
			for (String funcionario : funcionarios) {
				System.out.println(funcionario);
			}
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome da empresa: ");
		String nomeEmpresa = entrada.nextLine();

		System.out.print("Digite o CNPJ da empresa: ");
		String cnpjEmpresa = entrada.nextLine();

		Empresa empresa = new Empresa(nomeEmpresa, cnpjEmpresa);

		while (true) {
			System.out.println("\nEscolha uma op��o:");
			System.out.println("1 - Contratar funcion�rio");
			System.out.println("2 - Demitir funcion�rio");
			System.out.println("3 - Exibir informa��es dos funcion�rios");
			System.out.println("0 - Sair");

			int opcao = entrada.nextInt();
			entrada.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do funcion�rio a ser contratado: ");
				String nomeContratar = entrada.nextLine();
				empresa.contratarFuncionario(nomeContratar);
				break;
			case 2:
				System.out.print("Digite o nome do funcion�rio a ser demitido: ");
				String nomeDemitir = entrada.nextLine();
				empresa.demitirFuncionario(nomeDemitir);
				break;
			case 3:
				empresa.exibirInformacoesFuncionarios();
				break;
			case 0:
				System.out.println("Encerrando a aplica��o.");
				entrada.close();
				System.exit(0);
			default:
				System.out.println("Op��o inv�lida. Tente novamente.");
			}
		}
	}
}
