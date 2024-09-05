package exercicio11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            populacao += quantidade;
            System.out.println("A população foi aumentado em " + quantidade + " pessoas. População atual: " + populacao);
        } else {
            System.out.println("A população não aumentou.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("A população foi diminuído em " + quantidade + " pessoas. População atual: " + populacao);
        } else if (quantidade > populacao) {
            System.out.println("Inválido. Não há pessoas o suficiente.");
        } else {
            System.out.println("Quantidade inválida para diminuir a populacao.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public int setPopulacao() {
        if (populacao > 0) {
            return populacao;
        }else {
            System.out.println("A população deve ser maior que 0");
            return 0;
        }
    }

    public String getEstado() {
        if (estado != null) {
            return estado;
        }else {
            System.out.println("Deve ser preenchido o Estado");
            return null;
        }
    }
}
