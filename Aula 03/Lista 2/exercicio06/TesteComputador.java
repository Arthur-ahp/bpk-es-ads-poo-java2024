package exercicio06;

import java.util.Scanner;

public class TesteComputador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o processador do computador: ");
        String processador = scanner.nextLine();

        System.out.println("Digite a memória RAM do computador: ");
        String memoriaRAM = scanner.nextLine();

        System.out.println("Digite o armazenamento do computador (em GB): ");
        int armazenamento = scanner.nextInt();

        Computador computador = new Computador(processador, memoriaRAM, armazenamento);

        System.out.println("Configurações do Computador:");
        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("Memória RAM: " + computador.getMemoriaRAM());
        System.out.println("Armazenamento: " + computador.getArmazenamento() + " GB");

        computador.ligar();
        computador.desligar();

        scanner.close();
    }
}