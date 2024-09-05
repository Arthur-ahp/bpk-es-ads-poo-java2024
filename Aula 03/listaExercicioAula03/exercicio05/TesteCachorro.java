package exercicio05;

import java.util.Scanner;

public class TesteCachorro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cachorro: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do cachorro: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a raça do cachorro: ");
        String raca = scanner.nextLine();

        Cachorro cachorro = new Cachorro(nome, raca, idade);

        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Idade do cachorro: " + cachorro.getIdade());
        System.out.println("Raça do cachorro: " + cachorro.getRaca());

        cachorro.latir();
        cachorro.correr();

        scanner.close();
    }
}