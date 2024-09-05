package exercicio06;

public class Computador {
    private String processador;
    private String memoriaRAM;
    private int armazenamento;

    public Computador(String processador, String memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("Ligando o computador");
    }

    public void desligar() {
        System.out.println("Desligando o computador");
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }
}
