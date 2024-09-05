package exercicio18;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Você está pedalando a bicicleta " + marca + " modelo " + modelo + " com rodas de " + tamanhoRoda + " polegadas.");
    }

    public void frear() {
        System.out.println("Você acionou os freios da bicicleta " + marca + " modelo " + modelo + ".");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }
}
