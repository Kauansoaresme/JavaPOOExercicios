package exerciciosBascisoPOOJava;
import java.util.Scanner;
//Crie uma classe 'ContaBancaria' com atributos como saldo e número da conta. Adicione métodos para depositar, sacar e exibir o saldo. 

public class ContaBancaria {

	private double saldo;
	private String numConta;

	public ContaBancaria(double primeiroSaldo, String numConta) {
		this.saldo = primeiroSaldo;
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("O valor precisa ser maior que 0!");
		} else {
			saldo += valor;
			System.out.println("Deposito realizado com sucesso!");
			System.out.println("Valor: " + saldo + "R$");
		}
	}

	public void sacar(double saque) {
		if (saque > 0 && saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque de R$" + saque + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
	}

	public void exibirSaldo() {
		System.out.println("Número da conta:" + numConta);
		System.out.println("Saldo: " + saldo);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número da sua conta bancária:");
		String contaBanc = entrada.nextLine();
		System.out.println("Saldo inicial");
		double saldoInicial = entrada.nextDouble();
		ContaBancaria conta = new ContaBancaria(saldoInicial, contaBanc);
		System.out.println("Qual valor você deseja depositar? ");
		double valorDeposito = entrada.nextDouble();
		conta.depositar(valorDeposito);
		
		System.out.println("Qual valor você deseja sacar? ");
		double valorSaque = entrada.nextDouble();
		conta.sacar(valorSaque);
		
		conta.exibirSaldo();
		entrada.close();

	}

}
