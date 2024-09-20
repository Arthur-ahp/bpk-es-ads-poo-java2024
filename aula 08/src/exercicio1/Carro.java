package exercicio1;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void acionarAcelerador(int incrementoRpm) {
        System.out.println("Acelerando...");
        motor.acelerar(incrementoRpm);
    }

    public void acionarFreio(int decrementoRpm) {
        System.out.println("Freando...");
        motor.reduzirRpm(decrementoRpm);
    }

    public void trocarMarcha() {
        System.out.println("Trocando marcha...");
    }

    public void ligarCarro() {
        System.out.println("Ligando carro...");
        motor.ligar();
    }

    public void desligarCarro() {
        System.out.println("Desligando carro...");
        motor.desligar();
    }

    public void turboBoost() {
        System.out.println("Ativando turbo...");
        motor.aumentarPotencia(50);
    }

    public void reduzirPotenciaMotor() {
        System.out.println("Reduzindo a potência...");
        motor.reduzirPotencia(50);
    }
}
