package exercicio11;

import java.util.Scanner;

public class TesteCidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da cidade: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade de pessoas: ");
        int populacao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o estado da cidade: ");
        String estado = scanner.nextLine();

        Cidade cidade = new Cidade(nome, populacao, estado);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Aumenta população/ 2 - Diminui a população");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                cidade.aumentarPopulacao(populacao);
            } else if (escolha == 2) {
                cidade.diminuirPopulacao(populacao);
            }
        } while (escolha != 0);

        System.out.println("Nome da cidade: " + cidade.getNome());
        System.out.println("Quantidade da população:" + cidade.getPopulacao());
        System.out.println("Nome do estado: " + cidade.getEstado());

        scanner.close();
    }
}
