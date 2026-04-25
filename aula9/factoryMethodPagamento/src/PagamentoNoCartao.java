public class PagamentoNoCartao implements Pagamento {
    @Override
    public void realizarPagamento(Double valor) {
        System.out.println("Pagamento no cartão realizado no valor de: " + valor);
    }   

}
