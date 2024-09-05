package exercicio12;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao; // duração em minutos

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciarFilme() {
        System.out.println("O filme '" + titulo + "' dirigido por " + diretor + " está começando. Duração: " + duracao + " minutos.");
    }

    public void pararFilme() {
        System.out.println("O filme '" + titulo + "' foi pausado.");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public int setDuracao() {
        if (duracao > 0) {
            return duracao;
        }else {
            System.out.println("A duração tem que ser maior que zero.");
            return 0;
        }
    }
}
