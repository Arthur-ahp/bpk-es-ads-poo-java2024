import java.util.Scanner;
import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        int sorte;
        int number = (int)(Math.random() * 101);

        for (int i = 1; i < 2;) {
            System.out.println("Digite um número (0-100):");
            Scanner sc = new Scanner(System.in);
            sorte = sc.nextInt();
            if (sorte == number) {
                System.out.println("Parabéns !!! Você acertou");
                i++;
            }if (sorte > number) {
                System.out.println("O número é menor que " + sorte);
            }if (sorte < number) {
                System.out.println("O número é maior que " + sorte);
            }
        }
    }
}