package exercicio01;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrirLivro() {
        if (paginaAtual == 0) {
            paginaAtual = 1;
            System.out.println("Você abriu o livro na página 1.");
        } else {
            System.out.println("O livro já está aberto na página " + paginaAtual);
        }
    }

    public void lerPagina() {
        if (paginaAtual > 0) {
            if (paginaAtual < numeroDePaginas) {
                System.out.println("Lendo a página " + paginaAtual + "...");
                paginaAtual++;
            } else {
                System.out.println("Você terminou o livro.");
            }
        } else {
            System.out.println("Você precisa abrir o livro.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        if (numeroDePaginas > 0) {
            this.numeroDePaginas = numeroDePaginas;
        } else {
            System.out.println("O número de páginas deve ser positivo.");
        }
    }

    public void setPaginaAtual(int paginaAtual) {
        if (paginaAtual >= 0 && paginaAtual <= numeroDePaginas) {
            this.paginaAtual = paginaAtual;
        } else {
            System.out.println("Página atual inválida.");
        }
    }
}
