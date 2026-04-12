package recursos.aps1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// DICA: essa classe salva pessoa em um mapa. Esta funcionando corretamente.
public class BancoDadosMapa implements BancoDados {

	
	private Map<Integer,Pessoa> m = new HashMap<Integer,Pessoa>();
	
	@Override
	public void salvar(Pessoa p) {
		m.put(p.getId(), p);

	}

	@Override
	public void remover(Integer idPessoa) {
		m.remove(idPessoa);

	}
	
	
	

	@Override
	public Pessoa buscar(Pessoa pe) {
		
		return m.get(pe.getId());
	}

	@Override
	public List<Pessoa> buscar() {	
		return new ArrayList<>(m.values());
	}

}
