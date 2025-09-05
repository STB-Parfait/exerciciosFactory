package pagamento;

public class FactoryCartaoCredito extends PagamentoFactory {
    private final String numeroCartao;
    public FactoryCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartaoCredito(this.numeroCartao);
    }
}
