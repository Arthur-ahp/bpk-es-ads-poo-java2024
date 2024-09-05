package exercicio19;

import java.util.Scanner;

public class TesteCozinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo da cozinha (por exemplo, 'gourmet', 'industrial'): ");
        String tipo = scanner.nextLine();

        System.out.println("Digite a quantidade de pessoas para quem a cozinha serve: ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a cor da cozinha: ");
        String cor = scanner.nextLine();

        Cozinha cozinha = new Cozinha(tipo, quantidadePessoas, cor);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Cozinhar/ 2 - Limpar");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                cozinha.cozinhar();
            } else if (escolha == 2) {
                cozinha.limpar();
            }
        } while (escolha != 0);

        scanner.close();
    }
}