package pagamento;

public class PagamentoApplePay implements Pagamento {
    public final String appleID;
    public PagamentoApplePay(String appleID) {
        this.appleID = appleID;
    }
    public boolean validar(){
        if(this.appleID==null){
            return false;
        } else {
            return this.appleID != "invalid";
        }
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando...");
        if(validar()){
            System.out.println("Pagamento realizado com sucesso!");
        } else{
            System.out.println("ID inválido!");
        }
    }
}
