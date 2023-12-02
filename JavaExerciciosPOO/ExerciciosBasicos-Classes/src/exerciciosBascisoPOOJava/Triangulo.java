package exerciciosBascisoPOOJava;
import java.util.Scanner;
//Crie uma classe 'Triangulo' com atributos para os lados. Adicione m�todos para calcular a �rea e verificar se � um tri�ngulo equil�tero, is�sceles ou escaleno

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
            System.out.println("N�o � um tri�ngulo v�lido para calcular a �rea.");
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

        System.out.print("Digite o comprimento do lado A do tri�ngulo: ");
        double ladoA = entrada.nextDouble();

        System.out.print("Digite o comprimento do lado B do tri�ngulo: ");
        double ladoB = entrada.nextDouble();

        System.out.print("Digite o comprimento do lado C do tri�ngulo: ");
        double ladoC = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
        
        if (triangulo.TrianguloVerdadeiro()) {
            System.out.println("�rea do tri�ngulo: " + triangulo.calcularArea());

            if (triangulo.Equilatero()) {
                System.out.println("� um tri�ngulo equil�tero.");
            } else if (triangulo.Isosceles()) {
                System.out.println("� um tri�ngulo is�sceles.");
            } else if (triangulo.Escaleno()) {
                System.out.println("� um tri�ngulo escaleno.");
            }
        } else {
            System.out.println("N�o � um tri�ngulo v�lido.");
        }
        entrada.close();
	}

}
