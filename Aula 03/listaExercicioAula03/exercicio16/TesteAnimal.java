package exercicio16;

import java.util.Scanner;

public class TesteAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a espécie do animal: ");
        String especie = scanner.nextLine();

        System.out.println("Digite a idade do animal: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso do animal: ");
        double peso = scanner.nextDouble();

        Animal animal = new Animal(especie, idade, peso);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Alimentar animal/ 2 - Colocar animal para dormir");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                animal.alimentar();
            } else if (escolha == 2) {
                animal.dormir();
            }
        } while (escolha != 0);

        scanner.close();
    }
}