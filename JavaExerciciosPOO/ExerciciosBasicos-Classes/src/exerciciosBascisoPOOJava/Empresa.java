package exerciciosBascisoPOOJava;
import java.util.ArrayList;
import java.util.Scanner;
//Crie uma classe 'Empresa' com atributos como nome, CNPJ e lista de funcionários. Adicione métodos para contratar, demitir e exibir informações sobre os funcionários. 


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
		System.out.println("Funcionário contratado: " + nomeFuncionario);
	}

	public void demitirFuncionario(String nomeFuncionario) {
		if (funcionarios.remove(nomeFuncionario)) {
			System.out.println("Funcionário demitido: " + nomeFuncionario);
		} else {
			System.out.println("Funcionário não encontrado.");
		}
	}

	public void exibirInformacoesFuncionarios() {
		if (funcionarios.isEmpty()) {
			System.out.println("A empresa não possui funcionários para exibir.");
		} else {
			System.out.println("Funcionários da empresa " + nome + ":");
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
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Contratar funcionário");
			System.out.println("2 - Demitir funcionário");
			System.out.println("3 - Exibir informações dos funcionários");
			System.out.println("0 - Sair");

			int opcao = entrada.nextInt();
			entrada.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do funcionário a ser contratado: ");
				String nomeContratar = entrada.nextLine();
				empresa.contratarFuncionario(nomeContratar);
				break;
			case 2:
				System.out.print("Digite o nome do funcionário a ser demitido: ");
				String nomeDemitir = entrada.nextLine();
				empresa.demitirFuncionario(nomeDemitir);
				break;
			case 3:
				empresa.exibirInformacoesFuncionarios();
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
