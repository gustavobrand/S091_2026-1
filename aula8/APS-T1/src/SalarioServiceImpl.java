public class SalarioServiceImpl implements SalarioService {

	private final BancoDados bancoDados;
	private final CalculadoraSalarioPessoaFisica calculadoraSalario;

	public SalarioServiceImpl(BancoDados bancoDados) {
		this.bancoDados = bancoDados;
		this.calculadoraSalario = new CalculadoraSalarioPessoaFisica();
	}

	@Override
	public String calcularSalario() {
		StringBuilder retorno = new StringBuilder();
		for (Pessoa pessoa : bancoDados.buscarTodos()) {
			if (pessoa instanceof PessoaFisica) {
				PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
				Float totalSalario = calculadoraSalario.calcularSalarioTotal(pessoaFisica.getSalario());
				retorno.append(pessoaFisica.getNome()).append(" salario total R$ ").append(totalSalario).append("\n");
			}
		}
		return retorno.toString();
	}

}
