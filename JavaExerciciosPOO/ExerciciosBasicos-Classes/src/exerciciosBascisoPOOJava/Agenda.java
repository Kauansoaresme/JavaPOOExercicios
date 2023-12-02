package exerciciosBascisoPOOJava;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<String> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato);
    }

    public void removerContato(String contato) {
        if (contatos.remove(contato)) {
            System.out.println("Contato removido: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia. Nenhum contato para exibir.");
        } else {
            System.out.println("Contatos na agenda:");
            for (String contato : contatos) {
                System.out.println(contato);
            }
        }
    }

 
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Exibir contatos");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato a ser adicionado: ");
                    String novoContato = scanner.nextLine();
                    minhaAgenda.adicionarContato(novoContato);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String contatoRemover = scanner.nextLine();
                    minhaAgenda.removerContato(contatoRemover);
                    break;
                case 3:
                    minhaAgenda.exibirContatos();
                    break;
                case 0:
                    System.out.println("Encerrando a aplicação.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

