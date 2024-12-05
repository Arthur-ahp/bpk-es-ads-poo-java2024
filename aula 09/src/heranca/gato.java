package heranca;

public class gato extends animal{

    private String porte;


    public gato(String nome, int idade, String porte) {
        super(nome, idade);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void miar(){
        System.out.println("MIIIIAAAAAUUUUUUU");
    }

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                "idade='" + idade + '\'' +
                "porte='" + porte + '\'' +
                '}';
    }
}

