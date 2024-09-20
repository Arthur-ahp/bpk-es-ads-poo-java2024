package exercicio2;

public class AplicacaoComposicao {
    public static void main(String[] args){
        Livro livro1 = new Livro("O princípe", "Maquiavel");

        livro1.adicionarPagina(1, "Fortuna e virtu");

        System.out.println(livro1);
    }
}
