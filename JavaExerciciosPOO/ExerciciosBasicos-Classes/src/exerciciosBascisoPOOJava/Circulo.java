package exerciciosBascisoPOOJava;

import java.util.Scanner;

public class Circulo {
//Crie uma classe chamada 'Círculo' que utilize a classe 'Ponto' para representar um círculo. Adicione métodos para calcular a área e o perímetro do círculo.

	private Ponto centro;
	private double raio;

	public Circulo(Ponto centro, double raio) {
		this.centro = centro;
		this.raio = raio;
	}

	public Ponto getCentro() {
		return centro;
	}

	public double getRaio() {
		return raio;
	}

	public double calcularArea() {
		return 3.14 * (raio * raio);
	}

	public double calcularPerimetro() {
		return 2 * 3.14 * raio;
	}

	public void exibirInformacoes() {
		System.out.println("Círculo:");
		System.out.println("Centro: (" + centro.getX() + ", " + centro.getY() + ")");
		System.out.println("Raio: " + raio);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor x:");
		double coorX = entrada.nextDouble();

		System.out.println("Digite o valor y:");
		double coorY = entrada.nextDouble();

		System.out.println("Digite o valor do raio:");
		double raio = entrada.nextDouble();

		Ponto centro = new Ponto(coorX, coorY);

		Circulo circulo = new Circulo(centro, raio);
		circulo.exibirInformacoes();

		entrada.close();
	}
}