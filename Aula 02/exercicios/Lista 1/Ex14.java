import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        String palavra;
        int number = 1;

        System.out.println("Digite uma palavra:");
        Scanner sc = new Scanner(System.in);
        palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            if ((palavra.charAt(i) == 'a') || (palavra.charAt(i) == 'e') || (palavra.charAt(i) == 'i') || (palavra.charAt(i) == 'o') || (palavra.charAt(i) == 'u')) {
                number++;
            }
        }
        System.out.println("A palavra possui " + number);
    }
}