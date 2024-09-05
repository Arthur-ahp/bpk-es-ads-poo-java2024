package exercicio20;

import java.util.Scanner;

public class TesteEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da empresa: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o CNPJ da empresa: ");
        String CNPJ = scanner.nextLine();

        System.out.println("Digite o número de funcionários da empresa: ");
        int numeroFuncionarios = scanner.nextInt();

        Empresa empresa = new Empresa(nome, CNPJ, numeroFuncionarios);

        int escolha;
        do {
            System.out.println("O que deseja fazer: 0 - Sair do loop/ 1 - Contratar funcionários/ 2 - Demitir funcionários");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Quantos funcionários deseja contratar?");
                int quantidade = scanner.nextInt();
                empresa.contratarFuncionarios(quantidade);
            } else if (escolha == 2) {
                System.out.println("Quantos funcionários deseja demitir?");
                int quantidade = scanner.nextInt();
                empresa.demitirFuncionarios(quantidade);
            }
        } while (escolha != 0);

        System.out.println("Nome da empresa: " + empresa.getNome());
        System.out.println("CNPJ da empresa: " + empresa.getCNPJ());
        System.out.println("Número total de funcionários: " + empresa.getNumeroFuncionarios());

        scanner.close();
    }
}