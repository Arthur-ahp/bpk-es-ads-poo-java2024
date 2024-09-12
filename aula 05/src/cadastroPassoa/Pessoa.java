package cadastroPassoa;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private List<Endereco> enderecos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<Endereco> incluirEndereco(Endereco endereco){
        enderecos.add(endereco);
        return enderecos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", enderecos=" + enderecos +
                '}';
    }
}
