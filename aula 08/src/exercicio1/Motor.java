package exercicio1;

public class Motor {
    private int cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private int rpm;
    private int potencia;

    public Motor(int cilindradas, String modelo, TipoCombustivel tipoCombustivel, int potencia) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.rpm = 0;
    }


    public String getModelo() {
        return modelo;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void ligar() {
        System.out.println("Motor ligando...");
        rpm = 1000;
    }

    public void desligar() {
        System.out.println("Motor desligando...");
        rpm = 0;
    }

    public void aumentarPotencia(int incremento) {
        potencia += incremento;
        System.out.println("Aumentando potência: " + potencia);
    }

    public void reduzirPotencia(int decremento) {
        if (potencia - decremento >= 0) {
            potencia -= decremento;
            System.out.println("Reduzindo potência: " + potencia);
        } else {
            System.out.println("Está no mínimo.");
        }
    }

    public void acelerar(int incrementoRpm) {
        rpm += incrementoRpm;
        System.out.println("Acelerando: " + rpm + " rpm.");
    }

    public void reduzirRpm(int decrementoRpm) {
        if (rpm - decrementoRpm >= 0) {
            rpm -= decrementoRpm;
            System.out.println("Reduzindo: " + rpm);
        } else {
            System.out.println("Está no mínimo.");
        }
    }
}
