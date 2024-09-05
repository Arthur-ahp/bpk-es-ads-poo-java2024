package exercicio15;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrirLoja() {
        System.out.println("A loja '" + nome + "' localizada em " + endereco + " está aberta.");
    }

    public void fecharLoja() {
        System.out.println("A loja '" + nome + "' localizada em " + endereco + " está fechada.");
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}
