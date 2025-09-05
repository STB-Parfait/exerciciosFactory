package pagamento;

public class PagamentoCriptomoeda implements Pagamento{
    private double saldo;
    public PagamentoCriptomoeda(double saldo){
        this.saldo = saldo;
    }
    public boolean validar(double valor){
        return valor <= saldo;
    }
    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando...");
        if(this.validar(valor)){
            System.out.println("Pagamento aprovado!");
        } else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
