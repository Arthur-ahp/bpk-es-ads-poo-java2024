package cadastroPassoa;

public class CadastroPessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Arthur", 17);
        System.out.println(pessoa);

        Endereco endereco = new Endereco("Reinoldo", "859647000", "Marechal", "PR");
        pessoa.incluirEndereco(endereco);
        System.out.println(pessoa);
    }
}
