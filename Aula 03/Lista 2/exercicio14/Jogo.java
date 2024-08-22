package exercicio14;

public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciarJogo() {
        System.out.println("O jogo '" + nome + "' do gênero " + genero + " está começando. Preço: R$" + preco);
    }

    public void pausarJogo() {
        System.out.println("O jogo '" + nome + "' foi pausado.");
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }
}
