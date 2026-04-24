public class PessoaServiceImpl implements PessoaService {

	private final BancoDados bancoDados;
	private final PessoaValidator pessoaValidator;
	private static int contadorId = 0;

	public PessoaServiceImpl(BancoDados bancoDados) {
		this.bancoDados = bancoDados;
		this.pessoaValidator = new PessoaValidator();
	}

	@Override
	public void salvar(Pessoa pessoa) throws Exception {
		pessoaValidator.validar(pessoa);
		pessoa.setId(contadorId++);
		bancoDados.salvar(pessoa);
	}

	@Override
	public void remover(Integer id) throws Exception {
		bancoDados.remover(id);
	}

	@Override
	public Pessoa buscar(Integer id) {
		if (id == null) {
			return null;
		}
		return bancoDados.buscar(id);
	}

}
