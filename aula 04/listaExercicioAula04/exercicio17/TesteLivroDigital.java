package exercicio17;

import java.util.Scanner;

public class TesteLivroDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.println("Digite o tamanho do arquivo do livro (em MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        LivroDigital livro = new LivroDigital(titulo, autor, tamanhoArquivo);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Abrir livro/ 2 - Fechar livro");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                livro.abrirLivro();
            } else if (escolha == 2) {
                livro.fecharLivro();
            }
        } while (escolha != 0);

        scanner.close();
    }
}