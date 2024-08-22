import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int num1;

        System.out.println("Informe um número inteiro:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("O número informado é par");
        }else {
            System.out.println("O número informado é impar");
        }
    }
}