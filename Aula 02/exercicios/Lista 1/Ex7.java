import java.util.Scanner;
public class Ex7 {
    public static int soma(int num1,int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Informe dois números:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int soma = soma(num1,num2);
        System.out.println("O resultado é " + soma);
    }
}