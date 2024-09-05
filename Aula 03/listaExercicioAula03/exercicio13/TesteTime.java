package exercicio13;

import java.util.Scanner;

public class TesteTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do time: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o nome do técnico: ");
        String tecnico = scanner.nextLine();

        System.out.println("Digite o número de jogadores no time: ");
        int numeroDeJogadores = scanner.nextInt();

        Time time = new Time(nome, tecnico, numeroDeJogadores);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Adicionar jogadores/ 2 - Remover jogadores");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Quantos jogadores deseja adicionar?");
                int quantidade = scanner.nextInt();
                time.adicionarJogadores(quantidade);
            } else if (escolha == 2) {
                System.out.println("Quantos jogadores deseja remover?");
                int quantidade = scanner.nextInt();
                time.removerJogadores(quantidade);
            }
        } while (escolha != 0);

        System.out.println("Nome do time: " + time.getNome());
        System.out.println("Nome do técnico: " + time.getTecnico());
        System.out.println("Número total de jogadores: " + time.getNumeroDeJogadores());

        scanner.close();
    }
}

