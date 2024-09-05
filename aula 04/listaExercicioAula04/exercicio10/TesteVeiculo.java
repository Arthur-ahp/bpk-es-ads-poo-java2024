package exercicio10;

import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo do veiculo: :");
        String tipo = scanner.nextLine();

        System.out.println("Digite a placa do veiculo: :");
        String placa = scanner.nextLine();

        System.out.println("Digite a cor do veiculo: :");
        String cor = scanner.nextLine();

        Veiculo veiculo = new Veiculo(tipo, placa, cor);

        veiculo.abastecer();
        veiculo.lavar();

        scanner.close();
    }
}
