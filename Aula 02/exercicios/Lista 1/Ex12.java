import java.util.Scanner;
import java.util.Arrays;

public class Ex12 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);// Arrumar os arrays de forma crescente

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}