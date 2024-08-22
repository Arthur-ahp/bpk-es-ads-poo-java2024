package exercicio15;

import java.util.Scanner;

public class TesteLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da loja: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço da loja: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone da loja: ");
        String telefone = scanner.nextLine();

        Loja loja = new Loja(nome, endereco, telefone);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Abrir loja/ 2 - Fechar loja");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                loja.abrirLoja();
            } else if (escolha == 2) {
                loja.fecharLoja();
            }
        } while (escolha != 0);

        scanner.close();
    }
}