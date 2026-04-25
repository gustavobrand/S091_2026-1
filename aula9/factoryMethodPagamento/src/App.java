public class App {
    public static void main(String[] args) throws Exception {
        FabricaDePagamento fabrica = new FabricaDePagamento();
		
		Pagamento formatoViaPix = fabrica.criar(FabricaDePagamento.TipoPagamento.Pix);
		Pagamento formatoViaCC = fabrica.criar(FabricaDePagamento.TipoPagamento.CartaoCredito);
		Pagamento formatoViaAVista = fabrica.criar(FabricaDePagamento.TipoPagamento.AVista);

        Pagamento formatoPagamento;
        formatoPagamento = formatoViaPix;
		formatoPagamento.realizarPagamento(100d);
        formatoPagamento = formatoViaCC;
		formatoPagamento.realizarPagamento(1000d);
        formatoPagamento = formatoViaAVista;
		formatoPagamento.realizarPagamento(2000d);    
    }
}
