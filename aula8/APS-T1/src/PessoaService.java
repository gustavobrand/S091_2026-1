
public interface PessoaService {

	public void salvar(Pessoa pessoa) throws Exception;

	public void remover(Integer id) throws Exception;

	public Pessoa buscar(Integer id);

}
