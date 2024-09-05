package exercicio07;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void media() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota 1 do aluno " + nome + ":");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do aluno " + nome + ":");
        int nota2 = sc.nextInt();
        System.out.println("Informe a nota 3 do aluno " + nome + ":");
        int nota3 = sc.nextInt();
        float media = (nota1 + nota2 + nota3) / 3.0f;
        System.out.println("A média do aluno " + nome + " = " + media);
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
