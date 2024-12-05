package heranca;

public class animal {
    protected String nome;
    protected int idade;

    public animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void repirar(){
        System.out.println("Respirando...");
    }

    @Override
    public String toString() {
        return "animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
