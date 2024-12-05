package Produtos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mochila Dell", 6000.00));
        produtos.add(new Produto("Mochila Dell", 6000.00));
        produtos.add(new Produto("Notebook Dell", 7000.00));
        produtos.add(new Produto("Teclado Dell", 3000.00));
        produtos.add(new Produto("Fone Dell", 5000.00));
        produtos.add(new Produto("Estojo Dell", 10000.00));
        produtos.add(new Produto("Mouseped Dell", 4500.00));

        List<Produto> produtosFiltrados = produtos
                .stream()
                .filter(produto -> produto.getPreco() >= 4000.00)
//                .map(produto -> produto.getNome().toUpperCase())
                .distinct()
                .toList();

        produtosFiltrados.forEach(produto -> System.out.println(produto));

    }
}