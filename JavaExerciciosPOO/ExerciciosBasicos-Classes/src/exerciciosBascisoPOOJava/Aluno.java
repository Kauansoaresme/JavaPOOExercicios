package exerciciosBascisoPOOJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	private String nome;
	private int matricula;
	private ArrayList<Double> notas;

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = new ArrayList<>();
	}

	public void adicionarNota(double nota) {
		notas.add(nota);
		System.out.println("Nota adicionada: " + nota);
	}

	public double calcularMedia() {
		if (notas.isEmpty()) {
			System.out.println("O aluno n�o tem notas para calcular a m�dia.");
			return 0.0;
		}

		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}

		return soma / notas.size();
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entrada.nextLine();

		System.out.print("Digite a matr�cula do aluno: ");
		int matriculaAluno = entrada.nextInt();
		entrada.nextLine();

		Aluno aluno = new Aluno(nomeAluno, matriculaAluno);

		while (true) {
			System.out.println("\nEscolha uma op��o:");
			System.out.println("1 - Adicionar nota");
			System.out.println("2 - Calcular m�dia");
			System.out.println("0 - Sair");

			int opcao = entrada.nextInt();
			entrada.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite a nota a ser adicionada: ");
				double novaNota = entrada.nextDouble();
				aluno.adicionarNota(novaNota);
				break;
			case 2:
				System.out.println("M�dia das notas: " + aluno.calcularMedia());
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