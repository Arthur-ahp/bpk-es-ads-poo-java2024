package exercicio05;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        if (idade>0) {
            this.idade = idade;
        }else {
            System.out.println("Idade não pode ser menor que 1");
        }
    }

    public void latir() {
        System.out.println("Au Au Au Au Au Au Au");
    }

    public void correr() {
        System.out.println("O cachorro está correndo");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade>0) {
            this.idade = idade;
        }else {
            System.out.println("A idade não pode ser menor que 0");
        }
    }

    public String getRaca() {
        return raca;
    }
}
