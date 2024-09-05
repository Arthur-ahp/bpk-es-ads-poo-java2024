package exercicio13;

public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogadores(int quantidade) {
        if (quantidade > 0) {
            numeroDeJogadores += quantidade;
            System.out.println("Adicionados " + quantidade + " jogadores. Número total de jogadores: " + numeroDeJogadores);
        } else {
            System.out.println("Quantidade inválida para adicionar jogadores.");
        }
    }

    public void removerJogadores(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroDeJogadores) {
            numeroDeJogadores -= quantidade;
            System.out.println("Removidos " + quantidade + " jogadores. Número total de jogadores: " + numeroDeJogadores);
        } else if (quantidade > numeroDeJogadores) {
            System.out.println("Quantidade inválida. Não há jogadores suficientes.");
        } else {
            System.out.println("Quantidade inválida para remover jogadores.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }
}
