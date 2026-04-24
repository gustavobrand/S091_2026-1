import java.util.List;

public interface BancoDados {

	public void salvar(Pessoa p);
	
	public void remover(Integer idPessoa);
	
	public Pessoa buscar(Integer idPessoa);
	
	public List<Pessoa> buscarTodos();
	
}
