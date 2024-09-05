package exercicio02;

public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeDeBateria;

    public Celular(String marca, String modelo, int capacidadeDeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeBateria = capacidadeDeBateria;
    }

    public void ligarCelular() {
        System.out.println("Ligando Celular...");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade de Bateria: " + capacidadeDeBateria);
    }

    public void desligarCelular() {
            System.out.println("Desligando Celular...");
        }

    public String getMarca() {
            return marca;
        }

    public String getModelo() {
            return modelo;
        }

    public int getCapacidadeDeBateria() {
            return capacidadeDeBateria;
        }
}


