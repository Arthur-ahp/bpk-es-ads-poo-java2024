package exercicio18;

import java.util.Scanner;

public class TesteBicicleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca da bicicleta: ");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo da bicicleta: ");
        String modelo = scanner.nextLine();

        System.out.println("Digite o tamanho da roda da bicicleta (em polegadas): ");
        int tamanhoRoda = scanner.nextInt();

        Bicicleta bicicleta = new Bicicleta(marca, modelo, tamanhoRoda);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Pedalar/ 2 - Frear");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                bicicleta.pedalar();
            } else if (escolha == 2) {
                bicicleta.frear();
            }
        } while (escolha != 0);

        scanner.close();
    }
}
