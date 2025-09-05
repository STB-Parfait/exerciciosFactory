package pagamento;

public class main {
    public static void main(String[] args) {
        PagamentoService pagamento = new PagamentoService();

        pagamento.processarPagamento(new PagamentoCartaoCredito("1111222233334444"), 150.00);

        pagamento.processarPagamento(new PagamentoPayPal("permitido@email.com"),75.00);

        pagamento.processarPagamento(new PagamentoCriptomoeda(500.00),300.00);

        pagamento.processarPagamento(new PagamentoApplePay("IDválido"),50.00);
    }
}
