package heranca;

public class cachorro extends animal{

    private String porte;


    public cachorro(String nome, int idade, String porte) {
        super(nome, idade);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void latir(){
        System.out.println("AAAAAAUUUUUUUU");
    }

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                "idade='" + idade + '\'' +
                "porte='" + porte + '\'' +
                '}';
    }
}
