package cadastroPassoa;

public class Endereco {
    private String logradouro;
    private String cep;
    private String cidade;
    private String uf;

    public Endereco(String logradouro, String cep, String cidade, String uf) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'';
    }
}
