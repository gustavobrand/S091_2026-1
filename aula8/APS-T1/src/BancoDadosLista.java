import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDadosLista implements BancoDados {

	private final List<Pessoa> pessoas = new ArrayList<Pessoa>();

	@Override
	public void salvar(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	@Override
	public void remover(Integer idPessoa) {
		Iterator<Pessoa> iterator = pessoas.iterator();
		while (iterator.hasNext()) {
			Pessoa pessoa = iterator.next();
			if (pessoa.getId().equals(idPessoa)) {
				iterator.remove();
				break;
			}
		}
	}

	@Override
	public Pessoa buscar(Integer idPessoa) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getId().equals(idPessoa)) {
				return pessoa;
			}
		}
		return null;
	}

	@Override
	public List<Pessoa> buscarTodos() {
		return new ArrayList<Pessoa>(pessoas);
	}

}
