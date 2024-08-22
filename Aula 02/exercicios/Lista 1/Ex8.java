import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        String nome;
        int idade;

        System.out.println("Informe seu nome e sua idade:");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        idade = sc.nextInt();

        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
    }
}