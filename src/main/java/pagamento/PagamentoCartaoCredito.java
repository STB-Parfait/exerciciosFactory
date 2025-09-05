package pagamento;

public class PagamentoCartaoCredito implements Pagamento {
    private String numeroCartao;
    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    private boolean validar(){
        if(this.numeroCartao == null){
            return false;
        } else{
            return this.numeroCartao.matches("^\\d{16}$");
        }
    }
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando...");
        if(this.validar()){
            System.out.println("Pagamento aprovado!");
        } else{
            System.out.println("Cartão invalido!");
        }
    }
}
