import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoDadosMapa implements BancoDados {

	private final Map<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();

	@Override
	public void salvar(Pessoa pessoa) {
		pessoas.put(pessoa.getId(), pessoa);
	}

	@Override
	public void remover(Integer idPessoa) {
		pessoas.remove(idPessoa);
	}

	@Override
	public Pessoa buscar(Integer idPessoa) {
		return pessoas.get(idPessoa);
	}

	@Override
	public List<Pessoa> buscarTodos() {
		return new ArrayList<Pessoa>(pessoas.values());
	}

}
