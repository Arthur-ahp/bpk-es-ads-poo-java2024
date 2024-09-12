package cadastroLivro;
import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nome;
    private int idade;
    private List<Livro> livros;

    public Autor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<Livro> incluirLivro(Livro livro){
        livros.add(livro);
        return livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", livros=" + livros +
                '}';
    }
}
