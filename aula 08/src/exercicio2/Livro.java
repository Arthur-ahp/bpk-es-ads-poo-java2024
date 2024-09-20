package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    public List<Pagina> paginas;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public void adicionarPagina(int numero, String conteudo){
        Pagina pagina = new Pagina(numero, conteudo);
        paginas.add(pagina);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }else {
            System.out.println("Titulo invalido");
        }
    }

    public String getAutor() {
        return autor;
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "titulo= " + titulo + '\'' +
                ", autor= " + autor + '\'' +
                ", paginas= " + paginas;
    }
}
