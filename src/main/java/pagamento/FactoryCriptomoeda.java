package pagamento;

public class FactoryCriptomoeda extends PagamentoFactory {
    private double saldo;
    public FactoryCriptomoeda(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCriptomoeda(this.saldo);
    }
}
