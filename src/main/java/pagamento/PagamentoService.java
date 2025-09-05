package pagamento;

public class PagamentoService {
    public void processarPagamento(Pagamento tipo, double transacao) {
        tipo.processarPagamento(transacao);
    }
}
