public class PagamentoNoPix implements Pagamento {
    @Override
    public void realizarPagamento(Double valor) {
        System.out.println("Pagamento no Pix realizado no valor de: " + valor);
    }

}
