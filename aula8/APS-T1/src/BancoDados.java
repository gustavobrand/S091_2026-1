package recursos.aps1;

import java.util.List;

public interface BancoDados {

	public void salvar(Pessoa p);
	
	public void remover(Integer idPessoa);
	
	public Pessoa buscar(Pessoa p);
	
	public List<Pessoa> buscar();
	
}
