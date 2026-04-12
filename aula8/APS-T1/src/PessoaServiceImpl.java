package recursos.aps1;

/**
 * 
 * Esta classe e responsavel pela camada de negocio.
 * Ela faz a ligacao com a camada de dados.
 * 
 */ 

// DICA: esta classe esta fazendo muita coisa
public class PessoaServiceImpl implements PessoaService {

	// DICA: aqui podemos usar SOLID: Pois e necessario ter a opcao de salvar numa mapa.
	// esta fixo o BancoDadosLista. Deve ter opcao de poder salvar pelo mapa, atraves da classe BancoDadosMapa
	private BancoDadosLista bancoDadosImpl  = new BancoDadosLista();
	private static int contadorID =0;
	
	
	
	// DICA: aqui esta fazendo muita coisa.
	@Override
	public void salva(Pessoa v) throws Exception {

		if(v == null) {
			throw new IllegalArgumentException("Pessoa esta null");
		}
		
		if(v.getNo() == null ||  v.getNo().equals("")) {
			throw new IllegalArgumentException("Nome da pessoa esta invalida");
		}
		
		if(v.getEnd() == null ||  v.getEnd().equals("")) {
			throw new IllegalArgumentException("Endereco da pessoa esta invalida");
		}
		

		// DICA: aqui esta fazendo muita coisa, e se for inserido uma pessoa juridica ?? vai dar erro.
		PessoaFisica pf = (PessoaFisica) v;
		if(pf.getSalario() == null || pf.getSalario() < 0) {
			throw new IllegalArgumentException("Salario da pessoa fisca esta invalida");
		}
		
		v.setId(contadorID++);
		
		bancoDadosImpl.salvar(v);

	}

	@Override
	public void remover(Integer i) throws Exception{

		bancoDadosImpl.remover(i);

	}

	@Override
	public Pessoa busca(Integer v) {
		Pessoa p = null;
		p = bancoDadosImpl.buscar(p);
		return p;
	}
	
	
	
	
	

	// DICA: aqui esta fazendo muita coisa, use SOLID
	@Override
	public String calculaSalario() {
		StringBuilder retorno = new StringBuilder();
		for(Pessoa p : bancoDadosImpl.buscar()) {
			if(p instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) p;
				Float totalSalario = 0f;
				if(pf.getSalario() < 1000) {
					totalSalario = (float) ((pf.getSalario() * 0.02) + pf.getSalario());
				}
				else if(pf.getSalario() < 3000) {
					totalSalario = (float) ((pf.getSalario() * 0.04) + pf.getSalario());
				}
				else {
					totalSalario = (float) ((pf.getSalario() * 0.07) + pf.getSalario());
				}
				retorno.append(pf.getNo()).append(" salario total R$ ").append(totalSalario).append("\n");
			}
		}
		
		return retorno.toString();
	}

}
