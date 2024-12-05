package polimorfismo;

public class PagamentoCredito implements Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento no credito!!!");
    }
}
