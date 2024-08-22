import java.util.Scanner;

public class Ex16 {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão que deseja realizar:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        double resultado;

        if (escolha == 1) {
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println(temperatura + " graus Celsius é igual a " + resultado + " graus Fahrenheit.");
        } else if (escolha == 2) {
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println(temperatura + " graus Fahrenheit é igual a " + resultado + " graus Celsius.");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}