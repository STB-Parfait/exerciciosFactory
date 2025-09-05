package pagamento;

public class FactoryApplePay extends PagamentoFactory{
    private String appleID;
    public FactoryApplePay(String appleID){
        this.appleID = appleID;
    }
    @Override
    Pagamento criarPagamento() {
        return new PagamentoApplePay(this.appleID);
    }
}
