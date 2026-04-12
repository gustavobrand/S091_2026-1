package recursos.aps1;


// DICA: aqui estamos fazendo muita coisa
public interface PessoaService {

	public void salva(Pessoa v) throws Exception;
	
	public void remover(Integer i) throws Exception;
	
	public Pessoa busca(Integer v);
	
	// salario somente de pessoa fisica
	public String calculaSalario();
	
}
