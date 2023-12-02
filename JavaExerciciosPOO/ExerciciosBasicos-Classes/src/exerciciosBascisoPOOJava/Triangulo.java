package exerciciosBascisoPOOJava;
import java.util.Scanner;
//Crie uma classe 'Triangulo' com atributos para os lados. Adicione métodos para calcular a área e verificar se é um triângulo equilátero, isósceles ou escaleno

public class Triangulo {
	private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public boolean TrianguloVerdadeiro() {
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }
    
    public double calcularArea() {
        if (TrianguloVerdadeiro()) {
            double s = (ladoA + ladoB + ladoC) / 2;
            return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        } else {
            System.out.println("Não é um triângulo válido para calcular a área.");
            return -1;
        }
    }
    
    public boolean Equilatero() {
        return TrianguloVerdadeiro() && (ladoA == ladoB) && (ladoB == ladoC);
    }

    public boolean Isosceles() {
        return TrianguloVerdadeiro() && ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC));
    }

    public boolean Escaleno() {
        return TrianguloVerdadeiro() && (ladoA != ladoB) && (ladoB != ladoC) && (ladoA != ladoC);
    }

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado A do triângulo: ");
        double ladoA = entrada.nextDouble();

        System.out.print("Digite o comprimento do lado B do triângulo: ");
        double ladoB = entrada.nextDouble();

        System.out.print("Digite o comprimento do lado C do triângulo: ");
        double ladoC = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
        
        if (triangulo.TrianguloVerdadeiro()) {
            System.out.println("Área do triângulo: " + triangulo.calcularArea());

            if (triangulo.Equilatero()) {
                System.out.println("É um triângulo equilátero.");
            } else if (triangulo.Isosceles()) {
                System.out.println("É um triângulo isósceles.");
            } else if (triangulo.Escaleno()) {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Não é um triângulo válido.");
        }
        entrada.close();
	}

}
