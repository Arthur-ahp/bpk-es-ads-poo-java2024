package exercicio20;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratarFuncionarios(int quantidade) {
        if (quantidade > 0) {
            numeroFuncionarios += quantidade;
            System.out.println("Contratados " + quantidade + " funcionários. Número total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Quantidade inválida para contratação.");
        }
    }

    public void demitirFuncionarios(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroFuncionarios) {
            numeroFuncionarios -= quantidade;
            System.out.println("Demitidos " + quantidade + " funcionários. Número total de funcionários: " + numeroFuncionarios);
        } else if (quantidade > numeroFuncionarios) {
            System.out.println("Quantidade inválida. Não há funcionários suficientes.");
        } else {
            System.out.println("Quantidade inválida para demissão.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        if (CNPJ != null) {
            this.CNPJ = CNPJ;
        }else {
            System.out.println("Esse dado não pode ser nulo.");
            this.CNPJ = "555555555555555";
        }
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        if (numeroFuncionarios > 0) {
            this.numeroFuncionarios = numeroFuncionarios;
        }else {
            System.out.println("Tem que ter mais de 0 funcionarios");
        }
    }
}
