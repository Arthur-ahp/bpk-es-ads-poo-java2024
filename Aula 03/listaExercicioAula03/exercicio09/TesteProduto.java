package exercicio09;

import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        produto.aumentarEstoque(50);
        produto.diminuirEstoque(30);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());

        scanner.close();
    }
}