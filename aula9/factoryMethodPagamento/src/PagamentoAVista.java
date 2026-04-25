public class PagamentoAVista implements Pagamento {
    @Override
    public void realizarPagamento(Double valor) {
        System.out.println("Pagamento à vista realizado no valor de: " + valor);
    }

}
