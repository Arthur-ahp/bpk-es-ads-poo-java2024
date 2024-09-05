package exercicio14;

import java.util.Scanner;

public class TesteJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do jogo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o gênero do jogo: ");
        String genero = scanner.nextLine();

        System.out.println("Digite o preço do jogo: ");
        double preco = scanner.nextDouble();

        Jogo jogo = new Jogo(nome, genero, preco);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Iniciar jogo/ 2 - Pausar jogo");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                jogo.iniciarJogo();
            } else if (escolha == 2) {
                jogo.pausarJogo();
            }
        } while (escolha != 0);

        scanner.close();
    }
}

