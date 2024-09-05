package exercicio04;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456", 1000.00);
        conta.depositar(500.00);
        conta.sacar(300.00);
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        conta.sacar(1500.00);
    }
}