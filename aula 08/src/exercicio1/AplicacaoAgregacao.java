package exercicio1;

public class AplicacaoAgregacao {
        public static void main(String[] args) {
    Motor motor = new Motor(3000, "V8", TipoCombustivel.GASOLINA, 500);
        Carro carro1 = new Carro("Fusca", motor);

            System.out.println("Carro1: " + carro1.getModelo() + " Motor: " + motor.getModelo() + " Combustível: " + TipoCombustivel.GASOLINA);
            motor.ligar();
            motor.acelerar(1500);
            motor.reduzirRpm(1200);
            motor.desligar();
    }
}
