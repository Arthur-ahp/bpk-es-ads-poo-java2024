package polimorfismo;

public class PagamentoDebito implements Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento no debito!!!");
    }
}
