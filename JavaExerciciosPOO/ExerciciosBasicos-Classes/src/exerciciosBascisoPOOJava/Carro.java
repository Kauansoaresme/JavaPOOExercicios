package exerciciosBascisoPOOJava;
import java.util.Scanner;
//Crie uma classe 'Carro' com atributos como modelo, ano e cor. Adicione métodos para ligar, desligar e exibir informações sobre o carro. 

public class Carro {
	
	private String modelo;
	private String cor;
	private int ano;
	
	boolean ligado;
	
	public Carro(String modelo, String cor, int ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public void ligar() {
		if (ligado == false) {
			ligado = true;
			System.out.println("O seu arro foi ligado!");
		}else {
			System.out.println("ERRO! O carro já está ligado");
		}
	}
	
	public void desligar() {
		if (ligado == true) {
			ligado = false;
			System.out.println("O seu arro foi desligado!");
		}else {
			System.out.println("ERRO! O carro já está desligado");
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("INFORMAÇÕES:");
		System.out.println("");
		System.out.println("Modelo:" + modelo);
		System.out.println("Cor:" + cor);
		System.out.println("Ano:" + ano);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o modelo do carro?");
		String model = entrada.nextLine();
		System.out.println("Qual a cor do carro?");
		String cor = entrada.nextLine();
		System.out.println("Qual o ano do carro?");
		int ano = entrada.nextInt();
		

		
		Carro carro = new Carro (model, cor, ano);
		carro.desligar();
		carro.ligar();
		carro.exibirInformacoes();
		
		
		entrada.close();
	}

}
