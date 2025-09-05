package pagamento;

import java.util.Objects;

public class PagamentoPayPal implements Pagamento{
    private String email;
    public PagamentoPayPal(String email) {
        this.email = email;
    }
    public boolean validar(){
        if(this.email == null){
            return false;
        } else{
            return !this.email.equals("invalid@email.com");
        }
    }
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando...");
        if(this.validar()){
            System.out.println("Pagamento pagado com sucesso!");
        } else{
            System.out.println("Email invalido!");
        }
    }
}
