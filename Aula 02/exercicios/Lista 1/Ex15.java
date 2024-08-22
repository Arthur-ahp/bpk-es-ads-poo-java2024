import java.util.Scanner;

public class Ex15 {
    // Método iterativo
    public static int fatorialIterativo(int numero) {
        int resultado = 1;
        for (int i = numero; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }

    // Método recursivo
    public static int fatorialRecursivo(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * fatorialRecursivo(numero - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        //versão iterativa
        int resultadoIterativo = fatorialIterativo(numero);
        System.out.println("Fatorial (Iterativo) de " + numero + " é: " + resultadoIterativo);

        //versão recursiva
        int resultadoRecursivo = fatorialRecursivo(numero);
        System.out.println("Fatorial (Recursivo) de " + numero + " é: " + resultadoRecursivo);
    }
}