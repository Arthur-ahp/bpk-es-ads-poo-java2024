package exercicio19;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha de tipo '" + tipo + "' está cozinhando para " + quantidadePessoas + " pessoas.");
    }

    public void limpar() {
        System.out.println("A cozinha de cor '" + cor + "' está sendo limpa.");
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        if (quantidadePessoas > 0) {
            this.quantidadePessoas = quantidadePessoas;
        }else {
            System.out.println("Esse dado não pode ser zero");
            this.quantidadePessoas = 1;
        }
    }

    public String getCor() {
        return cor;
    }
}
