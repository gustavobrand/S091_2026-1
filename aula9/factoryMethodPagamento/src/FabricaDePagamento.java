public class FabricaDePagamento {
    
    enum TipoPagamento {
        Pix,
        AVista,
        CartaoCredito
    }

    public Pagamento criar(TipoPagamento tipo) {
		Pagamento result = null;
		if(TipoPagamento.Pix == tipo) {
		    result = new PagamentoNoPix();
		} else if(TipoPagamento.AVista == tipo) {
		    result = new PagamentoAVista();
		} else if(TipoPagamento.CartaoCredito == tipo) {
		    result = new PagamentoNoCartao();
		}
		return result;
	}		
}
