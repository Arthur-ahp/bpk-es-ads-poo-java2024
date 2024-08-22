import java.util.Scanner;

public class Ex3 {
        public static void main(String[] args){
            int num1, num2, num3;

            System.out.println("Informe dois número:");
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            num3 = num1 + num2;
            System.out.println("A soma dos dois números é " + num3);
            num3 = num2 - num1;
            System.out.println("A subtração dos dois números é " + num3);
            if (num1 > num2) {
                num3 = num1 / num2;
                System.out.println(" A divisão dos dois números é " + num3);
            }else {
                num3 = num2 / num1;
                System.out.println("A divisão dos dois números é " + num3);
            }
            num3 = num1 * num2;
            System.out.println("A multiplicação dos dois números é " + num3);
        }
}