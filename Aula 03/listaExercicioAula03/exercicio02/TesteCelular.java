package exercicio02;

import java.util.Scanner;

public class TesteCelular {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do celular: ");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do celular: ");
        String modelo = scanner.nextLine();

        System.out.println("Digite a capacidade de bateria: ");
        int capacidadeDeBateria = scanner.nextInt();

        Celular celular = new Celular(marca, modelo, capacidadeDeBateria);

        celular.ligarCelular();
        celular.desligarCelular();

        scanner.close();
    }
}
