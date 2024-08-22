package exercicio03;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, idade, altura);

        pessoa.apresentar();

        scanner.close();
    }
}
