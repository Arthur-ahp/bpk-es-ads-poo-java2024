package exercicio09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque aumentado em " + quantidade + " unidades. Estoque atual: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade inválida para aumentar o estoque.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Estoque diminuído em " + quantidade + " unidades. Estoque atual: " + quantidadeEstoque);
        } else if (quantidade > quantidadeEstoque) {
            System.out.println("Quantidade inválida. Não há estoque suficiente.");
        } else {
            System.out.println("Quantidade inválida para diminuir o estoque.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double setPreco() {
        if (preco > 0) {
            return preco;
        }else {
            System.out.println("preço tem que ser maior que 0");
            return 0;
        }
    }

    public int setQuantidadeEstoque() {
        if (quantidadeEstoque > 0) {
            return quantidadeEstoque;
        }else {
            System.out.println("Estoque tem que ser maior que 0");
            return 0;
        }
    }
}
