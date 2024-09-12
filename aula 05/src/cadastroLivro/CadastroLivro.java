package cadastroLivro;

public class CadastroLivro {
    public static void main(String[] args) {
        Autor autor = new Autor("Arthur", 17);
        System.out.println(autor);

        Livro livro = new Livro("Suicidas", 2016);
        autor.incluirLivro(livro);
        System.out.println(autor);

    }
}
