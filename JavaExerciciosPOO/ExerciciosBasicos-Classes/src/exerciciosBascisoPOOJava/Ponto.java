package exerciciosBascisoPOOJava;

import java.util.Scanner;

public class Ponto {

	// Crie uma classe chamada 'Ponto' com atributos 'x' e 'y' (coordenadas) e
	// métodos para definir e exibir esses valores.

	private double x;
	private double y;

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void exibir() {
		System.out.println("Coordenadas: " + x + "," + y);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a coordenada x:");
		double CoorX = entrada.nextDouble();

		System.out.print("Digite a coordenada y:");
		double CoorY = entrada.nextDouble();

		Ponto ponto = new Ponto(CoorX, CoorY);

		ponto.exibir();

		System.out.println("Digite a nova coordenada x:");
		double novaX = entrada.nextDouble();
		ponto.setX(novaX);

		System.out.println("Digite a nova coordenada y:");
		double novaY = entrada.nextDouble();
		ponto.setY(novaY);
		ponto.exibir();

		entrada.close();
	}

}
