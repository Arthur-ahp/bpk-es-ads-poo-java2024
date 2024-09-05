package exercicio08;

import java.util.Scanner;

public class TesteProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do professor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a disciplina do professor: ");
        String disciplina = scanner.nextLine();

        System.out.println("Digite o salário do professor: ");
        double salario = scanner.nextDouble();

        Professor professor = new Professor(nome, disciplina, salario);

        professor.darAula();
        professor.corrigirProvas();

        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Salário: R$" + professor.getSalario());

        scanner.close();
    }
}