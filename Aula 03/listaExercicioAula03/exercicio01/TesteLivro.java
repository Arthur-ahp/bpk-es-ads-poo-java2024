package exercicio01;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite o número de páginas do livro:");
        int numeroDePaginas = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, numeroDePaginas);

        livro.abrirLivro();
        livro.lerPagina();

        scanner.close();
    }
}
