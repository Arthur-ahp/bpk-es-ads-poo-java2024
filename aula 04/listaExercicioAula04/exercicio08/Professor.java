package exercicio08;

public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        System.out.println("O professor " + getNome() + " está dando aula de " + getDisciplina() + ".");
    }

    public void corrigirProvas() {
        System.out.println("O professor " + getNome() + " está corrigindo provas de " + getDisciplina() + ".");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }else {
            System.out.println("Salario não pode ser negativo ou zero.");
        }
    }
}