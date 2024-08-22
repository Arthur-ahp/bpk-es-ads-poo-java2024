import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        float num1, num2;
        char operacao;
        System.out.println("Digite dois numero e depois informe a operação que deseja(+,-,*,/): ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        operacao = sc.next().charAt(0);
        switch (operacao) {
            case '+' -> {
                num1 = num1 + num2;
                System.out.println(num1);
            }
            case '-' -> {
                num1 = num1 - num2;
                System.out.println(num1);
            }
            case '*' -> {
                num1 = num1 * num2;
                System.out.println(num1);
            }
            case '/' -> {
                num1 = num1 / num2;
                System.out.println(num1);
            }
        }
    }
}