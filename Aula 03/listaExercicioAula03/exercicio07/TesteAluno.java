package exercicio07;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o curso que o aluno faz: ");
        String curso = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula, curso);

        aluno.media();

        scanner.close();
    }
}