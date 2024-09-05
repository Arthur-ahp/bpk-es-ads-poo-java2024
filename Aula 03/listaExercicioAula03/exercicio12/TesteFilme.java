package exercicio12;

import java.util.Scanner;

public class TesteFilme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do filme: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite o diretor do filme: ");
        String diretor = scanner.nextLine();

        System.out.println("Digite a duração do filme (em minutos): ");
        int duracao = scanner.nextInt();

        Filme filme = new Filme(titulo, diretor, duracao);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Iniciar filme/ 2 - Parar filme");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                filme.iniciarFilme();
            } else if (escolha == 2) {
                filme.pararFilme();
            }
        } while (escolha != 0);

        scanner.close();
    }
}
